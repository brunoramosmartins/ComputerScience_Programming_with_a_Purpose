# Week 1: Summary

Por que programar? Esta primeira parte do curso aborda essa questão básica. Em seguida, ele descreve a anatomia do nosso primeiro programa (o clássico "Hello, World!") e o processo de desenvolvimento de um programa em Java usando terminais virtuais ou um ambiente de desenvolvimento de programas, com algum contexto histórico. A maior parte da palestra é dedicada a uma cobertura completa dos tipos de dados internos do Java, com programas de exemplo para cada um.

## Three versions of the same program.

```Java
public class HelloWorld
{ 
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
    }
}
```

```Java
/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 ******************************************************************************/

public class HelloWorld {

    public class static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
```

```Java
public class HelloWorld { public static void main(String[] args) { System.out.println("Hello, World"); } }
```

## Why programming?

Aprender a programação oferece diversos benefícios, como:

- Solução de problemas: A programação permite que você desenvolva habilidades de resolução de problemas, pois envolve a quebra de um problemas complexos em etapas menores e sua solução passo a passo.
- Automação de tarefas: A programação permite que você automatize tarefas repetitivas, economizando tempo e esforço. Por exemplo, você pode escrever um programa para processar automaticamente grandes quantidades de dados.
- Criatividade e inovação: A programação oferece a oportunidade de criar coisas novas. Podemos desenvolver aplicativos, jogos, sites e outras soluções tecnológicas que podem melhorar a vida das pessoas ou resolver problemas específicos.
 - Carreiras e oportunidades: A demanda por profissionais de programação continua a crescer em diversas áreas, como desenvolvimento de software, inteligência artificial, análise de dados e segurança cibernética. Aprender programação pode abrir portas para uma variedade de oportunidades de carreira.
 - Pensamento lógico e  habilidades analíticas: A programação desenvolve habilidades de pensamento lógico e analítico, pois você precisa organizar e estruturar informações de maneira clara e precisa para criar programas funcionais.

## Built-in data types

- int: usado para representar valores inteiros
- double: usado para representar números decimais
- boolean: usado para representar valores verdadeiros ou falso
- String: Usado para representar cadeia de caracteres

## Type conversion

A conversão de tipo, também conhecida como type casting, é o processo de converter um valor de um tipo de dados para outro tipo de dado compatível. Em Java, existem duas formas principais de conversão de tipo: conversão implícita e conversão explícita.

- conversão implícita: Também chamada de "conversão automática", ocorre quando o Java faz automaticamente a conversão entre tipos compatíveis. Por exemplo, quando você atribui um valor inteiro a uma variável do tipo double, ocorre uma conversão implícita, pois o Java pode realizar essa conversão de forma segura. Exemplo:

```Java
int age = 25;
double altura = age; // conversão implícita de int para double
```

- conversão explícita: Também conhecida como "cast explícito", ocorre quando você especifica manualmente a conversão de um tipo para outro. Isso é feito colocando o tipo desejado entre parêntese antes do valores que você deseja converter. Exemplo:

```Java
double price = 19.99;
int IntegerPrice = (int) price; // conversão explícita de double para int
```

No exemplo acima, ao realizar o cast de `double` para `int`, a parte decimal do valor é truncado, resultando `19` sendo armazenado na variável.

Portanto, a diferença fundamental entre as duas formas de conversão é que conversão implícita é realizada automaticamente pelo copilador quando é segura e não há perda de informações, enquanto a conversão explícita requer especificação manual da conversão e pode levar à perda de dados.
