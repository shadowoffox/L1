package ru.geekbrains.classes.obstacles;

import ru.geekbrains.classes.Participant;
import ru.geekbrains.classes.Team;
import ru.geekbrains.classes.animals.Animal;

//3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;
public  class Course {

    public Obstacle YourSource[];

    public Course(Obstacle[] obstacles){
        this.YourSource = obstacles;

        }

    public void doIt(Team team){
        System.out.println("Команда " + team.YourTeamName + " На рубеже!");
        for (Participant participant : team.getYourTeam()) {
            for (Obstacle obstacle : YourSource) {
                obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
     }
}



