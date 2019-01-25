package ru.geekbrains.classes;

import ru.geekbrains.classes.animals.Cat;
import ru.geekbrains.classes.animals.Dog;
import ru.geekbrains.classes.obstacles.Obstacle;
import ru.geekbrains.classes.obstacles.Course;

//2. Добавить класс Team, который будет содержать название команды,
// массив из четырех участников (в конструкторе можно сразу указывать всех участников ),
// метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.
public class Team  {
   public final String YourTeamName = "ForTeam";

   public Participant YourTeam[];

    public Team(Participant[] participants) {

        this.YourTeam = participants;
    }

    public Participant[] getYourTeam() {
        return YourTeam;
    }
}




