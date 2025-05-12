# Projeto de Testes Automatizados - Beecrowd 1040

## Problema Escolhido

**1040 - Média 3 (Beecrowd)**  
O problema exige o cálculo da média ponderada de quatro notas, com possibilidade de realização de um exame adicional. A situação do aluno pode ser "Aprovado", "Reprovado" ou "Aprovado após exame".

Enunciado disponível em:  
https://www.beecrowd.com.br/judge/pt/problems/view/1040

---

## Objetivo do Trabalho

Aplicar técnicas de testes automatizados com **JUnit** para aceitar ou rejeitar a lógica da classe `App.java`, utilizando o framework **Maven** para gestão de dependências e execução.

---

## Técnicas de Teste Aplicadas

Foram aplicadas **quatro** das seis técnicas solicitadas:

1. **Partições de Equivalência**
   - Casos: aprovado direto, reprovado direto, vai para exame
2. **Valor-Limite**
   - Casos nos limites 7.0 (aprovado) e 4.9 (reprovado)
3. **Propriedades**
   - Casos com notas iguais ou destaque em pesos
4. **Cobertura de Código**
   - Analisada via relatório do JaCoCo (ver abaixo)

Uma falha proposital foi inserida no cálculo da média com exame para validar a eficácia da suíte de testes.  
Essa falha está no método `calcularSituacao()`:

```java
double novaMedia = (media + exame); // deveria dividir por 2
```

---

## Ferramentas e Tecnologias

- Java 21
- JUnit 4.13
- Maven 3.8+
- JaCoCo 0.8.10

---

## Estrutura do Projeto

```
demo/
├── pom.xml
├── src/
│   ├── main/java/emidio/trabalho/App.java
│   └── test/java/emidio/trabalho/AppTest.java
└── target/
    └── site/jacoco/index.html
```

---

## Como Executar os Testes

Certifique-se de estar dentro da pasta `demo` e execute:

```bash
mvn clean verify
```

O Maven irá:
- Compilar o projeto
- Executar os testes com JUnit
- Gerar o relatório de cobertura de código

---

## Relatório de Cobertura

O relatório será gerado em:

```
target/site/jacoco/index.html
```

Abra o arquivo no navegador para visualizar os trechos cobertos e não cobertos do código-fonte.

---

## Evidências e Registro

As técnicas e os resultados foram registrados via:
- Issues no GitHub (`Cobertura de Código`, `Valor-Limite`, `Propriedades`, `Partições de Equivalência`)
- Imagens e relatórios adicionados à Wiki e `/docs`

---

## Autoria

Desenvolvido por Eduardo Emidio  
Curso: Engenharia de Software  
Instituição: Pucrs  
Data: 13/05/2025