# 🧠 EasyLanguage Compiler

Um compilador educacional desenvolvido para demonstrar os princípios fundamentais da construção de um compilador, desde a análise léxica até a geração de código executável em Java.

---

## 📘 Descrição do Projeto

O **EasyLanguage Compiler** é um compilador para uma linguagem de programação didática chamada **EasyLanguage**, criada para fins acadêmicos e de estudo de compiladores.  
Ele abrange todas as fases principais do processo de compilação:

1. **Análise Léxica (Lexing)**  
   O código-fonte em EasyLanguage é lido e dividido em **tokens** (palavras-chave, operadores, identificadores, etc.) pelo `EasyLanguageLexer`, gerado automaticamente com o **ANTLR 4**.

2. **Análise Sintática (Parsing)**  
   Verifica se a sequência de tokens segue as regras da gramática da linguagem. Gera uma **Árvore Sintática Abstrata (AST)** com o `EasyLanguageParser`.

3. **Análise Semântica**  
   Valida a correção lógica e de tipos do programa.  
   Exemplo: verifica se variáveis foram declaradas, se os tipos são compatíveis, etc.

4. **Geração de Código**  
   Traduz a AST validada em um código equivalente em **Java**, gerando o arquivo `MainClass.java`, que pode ser compilado e executado normalmente pela **JVM**.

---

## 🚀 O Que o Projeto Faz

Com o **EasyLanguage Compiler**, você pode:

- Escrever programas em uma **linguagem simplificada (EasyLanguage)**  
- Compilá-los automaticamente para **Java**
- E executar o código gerado em qualquer ambiente que suporte a **Java Virtual Machine (JVM)**

O projeto é ideal para estudantes e desenvolvedores que desejam entender **como linguagens de programação funcionam internamente**.

---

## 💡 Funcionalidades da EasyLanguage

✅ **Declaração de variáveis**  
- `numero`, `texto`, `booleano`  
  → Mapeados para `double`, `String` e `boolean` em Java  

✅ **Estruturas de controle**  
- `para` → loop `for`  
- `enquanto` → loop `while`  
- `se ... senao` → condicionais `if / else`

✅ **Funções e procedimentos**  
- Funções com retorno e procedimentos (sem retorno)

✅ **Operações suportadas**
- Aritméticas: `+`, `-`, `*`, `/`, `%`
- Lógicas: `e` (`&&`), `ou` (`||`), `nao` (`!`)
- Relacionais: `>`, `<`, `>=`, `<=`, `==`, `!=`

✅ **Entrada e saída**
- `leia` → entrada do usuário  
- `escreva` → saída no console  

✅ **Arrays (Vetores)**
- Suporte à declaração e manipulação de vetores

✅ **Escopo de variáveis**
- Suporte a escopos **global** e **local**

---

## 🧩 Estrutura do Projeto

EasyLanguage-Compiler/
│
├── pom.xml                        # Configuração Maven
├── resources/
│   ├── EasyLanguage.g4            # Gramática ANTLR
│   └── *.easy                     # Exemplos de código EasyLanguage
└── src/
└── main/java/br/edu/cefsa/compiler/
├── main/MainClass.java    # Classe principal do compilador
├── parser/                # Lexer e Parser (ANTLR)
├── abstractsyntaxtree/    # Definição da AST
├── datastructures/        # Tabela de símbolos e estruturas auxiliares
└── exceptions/            # Exceções personalizadas

---

## ⚙️ Tecnologias Utilizadas

- **Java 17+**
- **ANTLR 4**
- **Maven**
- **IntelliJ IDEA** (recomendado)
- **Padrão de compilação modular e extensível**

---

## 🧱 Como Rodar o Projeto

### 🪜 Pré-requisitos

- **Java JDK 17** ou superior  
- **Apache Maven**  
- **IntelliJ IDEA** (ou qualquer IDE com suporte a Maven)

---

### ▶️ Passos para Executar o Compilador

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/EasyLanguage-Compiler.git
   cd EasyLanguage-Compiler

	2.	Abra o projeto no IntelliJ IDEA
	•	Vá em File → Open…
	•	Selecione a pasta EasyLanguage-Compiler
	3.	Reconstrua o projeto
	•	Vá em Build → Rebuild Project
	•	Isso garante a geração do parser ANTLR e a compilação de todas as dependências
	4.	Execute o compilador
	•	Abra src/main/java/br/edu/cefsa/compiler/main/MainClass.java
	•	Clique com o botão direito → Run ‘MainClass.main()’
	5.	Defina o arquivo de entrada
	•	Vá em Run → Edit Configurations…
	•	No campo Program arguments, insira o nome do arquivo .easy, por exemplo:

demonstracao_final.easy


	•	Clique em Apply e OK
	•	Execute novamente o programa

	6.	O compilador irá gerar um arquivo MainClass.java na raiz do projeto, com o código Java equivalente ao programa EasyLanguage.

⸻

💻 Compilando e Executando o Código Java Gerado
	1.	Abra o terminal na pasta do projeto:

cd EasyLanguage-Compiler


	2.	Compile o código gerado:

javac MainClass.java


	3.	Execute o programa:

java MainClass



⸻

🧩 Exemplo de Código EasyLanguage

funcao principal() {
    numero x
    escreva("Digite um número:")
    leia(x)
    
    se (x > 0) {
        escreva("Número positivo!")
    } senao {
        escreva("Número negativo ou zero.")
    }
}

✨ Saída após compilação e execução:

Digite um número:
5
Número positivo!


⸻

📚 Créditos e Autoria

Desenvolvido por Igor A. Pierote
💼 Projeto acadêmico — Faculdade FESA
