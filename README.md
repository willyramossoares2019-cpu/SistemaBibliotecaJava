# Atividades de Java: herança, sobrecarga e sobrescrita

Resolução dos 10 exercícios da lista de Laboratório de Técnicas de Programação Orientada a Objetos.

Cada pasta contém uma superclasse concreta, duas subclasses e a classe de execução. Há uma classe pública por arquivo, sem pacotes, interfaces, classes abstratas, exceções ou coleções. Os atributos comuns são `protected`; os específicos são `private`.

## Executar

Instale um JDK (Java 8 ou superior). No terminal, entre na pasta do exercício e compile os quatro arquivos juntos:

```sh
cd 01-pet-shop
javac *.java
java TestePetShop
```

| Exercício | Pasta | Classe principal |
|---|---|---|
| 1 | [01-pet-shop](01-pet-shop) | `TestePetShop` |
| 2 | [02-escola](02-escola) | `TesteEscola` |
| 3 | [03-papelaria](03-papelaria) | `TestePapelaria` |
| 4 | [04-clinica](04-clinica) | `TesteClinica` |
| 5 | [05-biblioteca](05-biblioteca) | `TesteBiblioteca` |
| 6 | [06-lanchonete](06-lanchonete) | `TesteLanchonete` |
| 7 | [07-imobiliaria](07-imobiliaria) | `TesteImobiliaria` |
| 8 | [08-academia](08-academia) | `TesteAcademia` |
| 9 | [09-cinema](09-cinema) | `TesteCinema` |
| 10 | [10-transporte-escolar](10-transporte-escolar) | `TesteTransporte` |

## Conceitos

- **Herança:** `extends` permite à subclasse herdar os atributos e métodos da classe geral. O construtor chama `super(...)` primeiro.
- **Sobrescrita:** cada subclasse usa `@Override` e a mesma assinatura para modificar o comportamento. O vetor da superclasse permite observar o polimorfismo no `for`.
- **Sobrecarga:** os dois métodos de mesmo nome ficam apenas na superclasse e recebem parâmetros diferentes.

No cinema, `resumo(true)` chama `valorFinal()`, portanto utiliza o valor calculado pela subclasse. Na papelaria, o desconto respeita o preço mínimo informado. No transporte, ocupantes iguais à capacidade permitem a viagem.
