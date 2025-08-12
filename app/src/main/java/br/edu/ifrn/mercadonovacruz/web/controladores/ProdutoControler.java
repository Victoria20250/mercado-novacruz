package br.edu.ifrn.mercadonovacruz.web.controladores;

import java.util.List;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifrn.mercadonovacruz.persistencia.modelo.Produto;
import br.edu.ifrn.mercadonovacruz.persistencia.repositorio.ProdutoRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/produtos")
public class ProdutoControler {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listar(Model model) {
        List<Produto> produtos = produtoRepository.findAll();
        model.addAttribute("produtos", produtos);
        return "produtos/lista-produtos";
    }

    @GetMapping("/novo")
    public String formulario(Model model) {
        model.addAttribute("produto", new Produto());
        return "produtos/formulario-produto";
    }

    @PostMapping
    public String salvar(@Valid @ModelAttribute Produto produto, BindingResult result, Model model) {
        if (produto.getId() == null) {
            if (produtoRepository.findByCodigoBarras(produto.getCodigoBarras()).isPresent()) {
                result.rejectValue("codigoBarras", "erro.duplicado", "Já existe um produto com esse código de barras.");
            }
        } else {
            produtoRepository.findByCodigoBarras(produto.getCodigoBarras()).ifPresent(existingProduto -> {
                if (!existingProduto.getId().equals(produto.getId())) {
                    result.rejectValue("codigoBarras", "erro.duplicado", "Já existe outro produto com esse código de barras.");
                }
            });
        }

        if (produto.getPreco() != null && produto.getPreco().compareTo(BigDecimal.ZERO) <= 0) {
            result.rejectValue("preco", "erro.precoInvalido", "O preço deve ser maior que zero.");
        }

        if (result.hasErrors()) {
            return "produtos/formulario-produto";
        }

        produtoRepository.save(produto);
        return "redirect:/produtos";
    }
}
