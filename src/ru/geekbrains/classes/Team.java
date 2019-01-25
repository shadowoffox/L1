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
   public Participant YourTeam[]= new Participant[4];

    public Team(){

    this.YourTeam[0]= new Cat("Барсик", 10, 12, 0);
    this.YourTeam[1]= new Robot("Вертер", 50, 50, 50);
    this.YourTeam[2]= new Dog("Дружок", 20, 5, 15);
    this.YourTeam[3]= new Cat("СуперМурзик", 9, 14, 10);

    }

}




