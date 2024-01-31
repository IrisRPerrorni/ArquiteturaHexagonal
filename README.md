# ESTUDO DE ARQUITETURA HEXAGONAL 

A arquitetura hexagonal, também conhecida como "Ports and Adapters", é um padrão de design de software que visa criar sistemas mais flexíveis e independentes de frameworks externos. 

Na arquitetura hexagonal, o núcleo da aplicação (lógica de negócios) está no centro, e as interfaces com o mundo externo, como interfaces do usuário, serviços externos e banco de dados, são representadas por portas (ports) e adaptadores (adapters). Essa abordagem é chamada de "hexagonal" porque muitas vezes essas portas e adaptadores são dispostos em forma de hexágono em diagramas.


![image](https://github.com/IrisRPerrorni/ArquiteturaHexagonal/assets/133882090/31144364-7673-4db5-8937-43c8a33252e4)
                    imagem retirada de uma apresentação sobre arquitetura hexagonal na ZUP

Principais componentes da arquitetura hexagonal:

- Núcleo da Aplicação (Core): Contém a lógica de negócios ou as regras de domínio.
- Portas (Ports): São interfaces que representam as interações da aplicação com o mundo externo. Existem duas principais categorias de portas:
- Portas de Entrada (Input Ports): Representam as entradas de dados na aplicação, como interfaces do usuário, APIs, etc.
- Portas de Saída (Output Ports): Representam as saídas de dados da aplicação, como bancos de dados, serviços externos, etc.
- Adaptadores (Adapters): São implementações concretas das portas. Eles adaptam as interfaces específicas do mundo externo para a interface genérica definida pela aplicação. Existem adaptadores de entrada (input adapters) e adaptadores de saída (output adapters).

A principal vantagem da arquitetura hexagonal é a separação clara entre o núcleo da aplicação e as interações externas. Isso facilita a substituição de componentes externos sem afetar a lógica de negócios central. Além disso, torna os testes mais fáceis, pois as interações externas podem ser simuladas através de portas de teste.
Essa abordagem promove a flexibilidade, a manutenibilidade e a testabilidade do software, facilitando a evolução do sistema ao longo do tempo.
_______________________________________________
Esse repositório é somente um estudo e uma representação de código como seria uma arquitetura hexagonal 
