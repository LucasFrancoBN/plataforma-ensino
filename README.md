# Desafio: Plataforma de ensino
O objetivo desse projeto é criar uma plataforma de ensino. Para isso, o programa para ler os dados das aulas de um curso e, em seguida, mostrar a duração total do curso, que é a soma das durações de cada aula. 
As regras para este desafio são:

1. **Aulas:**
  
    Cada aula pode ser um conteúdo em vídeo ou então uma tarefa. Os dados de cada aula são:
    - Vídeo: título, url e duração em segundos.
    - Tarefa: título, descrição e quantidade de questões.

2. **Duração das aulas:**

   A duração (em segundos) de uma aula vídeo é a própria duração do vídeo, e a duração de uma aula tarefa é de cinco minutos por questão (exemplo: se a tarefa possui 3 questões, então a duração da tarefa é
15 minutos).


3. **Diagrama de classe UML:**
   - Seguir exatamente o diagrama de classe abaixo:
   
   ![Diagrama de classe](https://github.com/LucasFrancoBN/plataforma-ensino/blob/master/img/diagrama_classe.png)

## Exemplo
```plaintext
Quantas aulas tem o curso? 3

Dados da 1a aula:
Conteúdo ou tarefa (c/t)? c
Título: Orientação a objetos
URL do vídeo: https://youtu.be/aBh
Duração em segundos: 310

Dados da 2a aula:
Conteúdo ou tarefa (c/t)? c
Título: Listas em Java
URL do vídeo: https://youtu.be/e5a
Duração em segundos: 250

Dados da 3a aula:
Conteúdo ou tarefa (c/t)? t
Título: Exercício de fixação
Descrição: Faça um programa que imprima uma lista
Quantidade de questões: 2

DURAÇÃO TOTAL DO CURSO = 1160 segundos
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/plataforma-ensino.git

# Acesse o diretório da classe Program
cd plataforma-ensino/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/Lesson.java ../entities/Task.java ../entities/Video.java
```
Retroceda ao diretório src e compile o programa
```
# Retrocedendo ao diretório src
cd ../

# Execute o programa
java application.Program
```
