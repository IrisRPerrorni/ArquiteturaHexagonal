package catalisa.arquiteturaHexagonal.domain.service;

import catalisa.arquiteturaHexagonal.domain.model.Produto;

import java.util.List;

public interface ProdutoService {
    Produto obterProdutoPorId(Long id);
    void salvarProduto(Produto produto);
    List<Produto> listarTodosOsProdutos();
    void deletarProduto(Long id);

}
