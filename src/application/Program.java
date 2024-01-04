package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Lesson> lessons = new ArrayList<>();

    System.out.print("Quantas aulas tem o curso? ");
    int numberOfLessons = sc.nextInt();

    System.out.println();
    registerLessons(numberOfLessons, lessons, sc);

    System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos", sumDurations(lessons));

    sc.close();
  }

  public static void registerLessons(int numberOfLessons, List<Lesson> lessons, Scanner sc) {
    for (int i = 0; i < numberOfLessons; i++) {
      System.out.printf("Dados da %da aula:%n", i + 1);
      System.out.print("Conteúdo ou tarefa (c/t)? ");
      char typeOfLesson = sc.next().charAt(0);
      System.out.print("Título: ");
      sc.nextLine();
      String title = sc.nextLine();
      if(typeOfLesson == 'c') {
        System.out.print("URL do vídeo: ");
        String url = sc.nextLine();
        System.out.print("Duração em segundos: ");
        int seconds = sc.nextInt();
        lessons.add(new Video(title, url, seconds));
      }
      else if(typeOfLesson == 't') {
        System.out.print("Descrição: ");
        String description = sc.nextLine();
        System.out.print("Quantidade de questões: ");
        int numberOfQuestions = sc.nextInt();
        lessons.add(new Task(title, description, numberOfQuestions));
      }
      System.out.println();
    }
  }

  public static int sumDurations(List<Lesson> lessons) {
    int duration = 0;
    for (Lesson lesson :
        lessons) {
      duration += lesson.duration();
    }
    return duration;
  }
}
