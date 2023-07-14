public class User {
private House house;
private Car car;
private Phone phone;

    public User() {
    }

    public User(House house, Car car, Phone phone) {
        this.house = house;
        this.car = car;
        this.phone = phone;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
