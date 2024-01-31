package catalisa.arquiteturaHexagonal.interfaces;

import catalisa.arquiteturaHexagonal.domain.model.Produto;
import catalisa.arquiteturaHexagonal.domain.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/api/produtos/{id}")
    public ResponseEntity<Produto> obterProdutoPorId(@PathVariable Long id) {
        return ResponseEntity.ok().body(produtoService.obterProdutoPorId(id)) ;
    }

    @PostMapping("/api/produtos")
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        produtoService.salvarProduto(produto);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping("/api/produtos")
    public ResponseEntity<List<Produto>> listarTodosProdutos(){
        List<Produto> produtos = produtoService.listarTodosOsProdutos();
        return ResponseEntity.ok(produtos);
    }
    @DeleteMapping("/api/produtos/{id}")
    public ResponseEntity<String> deletarProdutoPorId(@PathVariable Long id) {
        produtoService.deletarProduto(id);
        return ResponseEntity.ok().body("Produto de id: " + id + " deletado!");
    }
}
