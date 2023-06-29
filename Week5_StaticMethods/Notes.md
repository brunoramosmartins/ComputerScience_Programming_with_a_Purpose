# Implementing mathematical functions

Agora consideramos duas funções importantes que desempenham um papel importante na ciência, engenharia e finanças. A função de distribuição Gaussiana (normal) é caracterizada pela conhecida curva em forma de sino e definida pela fórmula:

$$\phi(x)=\frac{1}{\sqrt{2\pi}} e^{-x^2/2}$$

a função de distribuição gaussiana cumulativa $\Phi(z)$ é definida como a área sob a curva definida por $\phi(x)$ acima do eixo $x$ e à esquerda da linha vertical $x = z$.

- _Closed form_. Na situação mais simples, temos uma equação matemática de forma fechada definindo nossa função em termos de funções implementadas na biblioteca Math. Este é o caso de $\phi(x)$.

- _No closed form_. Caso contrário, podemos precisar de um algoritmo mais complicado para calcular os valores da função. Esta situação é o caso para $\Phi(z)$, para o qual não existe nenhuma expressão de forma fechada. Para $z$ pequeno (respectivamente grande), o valor é extremamente próximo de 0 (respectivamente 1); então o código retorna diretamente 0 (respectivamente 1); caso contrário, a seguinte aproximação da série de Taylor é uma base eficaz para avaliar a função:

$$
\begin{align*}
\Phi(z)&=\int_{-\infty}^{z}\phi(x)dx\\
&= \frac{1}{2} + \sigma(z)\left(z+\frac{z^3}{3}+\frac{z^5}{3\cdot5}+\frac{z^7}{3\cdot5\cdot7}+ ...\right)
\end{align*}
$$