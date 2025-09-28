public class House {
    // Поля
    private int floor;

    // Геттеры и сеттеры
    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    // Конструкторы
    public House() {
        this.floor = 0;
    }

    public House(int floor) {
        if(floor <= 0) {
            System.out.println("У дома не может быть <=0 этажей");
        }
        else {
            this.floor = floor;
        }

    }

    // Метод toString
    @Override
    public String toString() {
        if(this.floor <=0) {
            return  "Дом должен содержать >0 этажей";
        }
        if(this.floor%10 == 1 && this.floor%100 != 11) {
            return "Дом с " + this.floor + " этажом";
        } else if((this.floor%10 >=2 && this.floor%10 <=4) && (!(this.floor %100 >= 12 && this.floor%100 <=14))) {
            return "Дом с " + this.floor + " этажами";
        } else {
            return "Дом с " + this.floor + " этажами";
        }
    }


}
