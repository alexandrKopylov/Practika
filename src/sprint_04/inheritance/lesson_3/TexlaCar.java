package sprint_04.inheritance.lesson_3;

class TexlaCar extends Automobile{
     double autoPilotMaxSpeed;
     double autoPilotAcceleration;

    public TexlaCar() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 10;
    }

    void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
    }
}