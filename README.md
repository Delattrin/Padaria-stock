> 🔁 Este projeto faz parte de uma série de evolução. Acompanhe a progressão: [sistema-padaria](https://github.com/Delattrin/sistema-padaria) → [sistema-padaria-oop](https://github.com/Delattrin/sistema-padaria-oop) → [sistema-notificacoes-padaria](https://github.com/Delattrin/sistema-notificacoes-padaria) → **Padaria-stock**
# 🥖 PadariaStock

Sistema de controle de estoque para a padaria da minha família, desenvolvido em Java com foco em Orientação a Objetos. O projeto demonstra na prática herança, polimorfismo e interfaces aplicados a um problema real.

## 📸 Preview
![Sistema rodando no terminal](<image.png>
)

## 🏗️ Estrutura do projeto

**Classe `Produto`**
- Classe base do sistema
- Atributos: `nome`, `preço`, `quantidade`
- Métodos: getters, setters e `descricao()`

**Classe `ProdutoPerecivel` extends `Produto`**
- Adiciona `dataValidade`
- Sobrescreve `descricao()` incluindo a validade

**Classe `ProdutoPadaria` extends `ProdutoPerecivel` implements `Estocavel`**
- Adiciona `tipoPao`
- Implementa controle de estoque crítico

**Classe `ProdutoBebida` extends `Produto` implements `Estocavel`**
- Adiciona `volume`
- Implementa controle de estoque crítico

**Interface `Estocavel`**
- Contrato com `restock(int quantidade)` e `isCritical()`
- Implementada por qualquer produto com controle de estoque

## 🧰 Tecnologias utilizadas
- Java
- IntelliJ IDEA

## ▶️ Como executar
1. Clone o repositório
```bash
git clone https://github.com/Delattrin/padaria-stock.git
```
2. Abra o projeto no IntelliJ IDEA
3. Execute o arquivo `Main.java`

## 📚 Conceitos aplicados
- Herança com `extends` em hierarquia de 3 níveis
- Polimorfismo — mesma chamada, comportamento diferente por classe
- Interfaces como contrato (`Estocavel`)
- `ArrayList` com tipos polimórficos
- Encapsulamento com `private` + getters/setters

## 👤 Autor
**Kauã Delattre**  
[LinkedIn](https://linkedin.com/in/kaua-delattre-2a8646354/) • [GitHub](https://github.com/Delattrin)
