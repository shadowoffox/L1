package ru.geekbrains.classes.obstacles;

import ru.geekbrains.classes.Participant;

//3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;
public  class Course  {

    public Obstacle YourSource[] = new Obstacle[3];

    public Course(){

              this.YourSource[0] =  new Cross(5);
              this.YourSource[1] =  new Wall(3);
              this.YourSource[2] =  new Water(7);

        }

 public void JustDoIt(){
 }
}



