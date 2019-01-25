package ru.geekbrains.classes.obstacles;

import ru.geekbrains.classes.Participant;
import ru.geekbrains.classes.Team;
import ru.geekbrains.classes.animals.Animal;

//3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;
public  class Course extends Obstacle {

    public Obstacle YourSource[];

    public Course(Obstacle[] obstacles){
        this.YourSource = obstacles;

        }
    @Override
    public void doIt(Participant team){

     }
}



