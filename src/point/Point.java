package point;

class Point {
   private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    private boolean isInFirstQuarter() {
        return (x > 0 && y > 0);
    }

    private boolean isInSecondQuarter() {
        return (x < 0 && y > 0);
    }

    private boolean isInThirdQuarter() {
        return (x < 0 && y < 0);
    }

    private boolean isInFourthQuarter() {
        return (x > 0 && y < 0);
    }

    private boolean isOnXAxis() {
        return (x != 0 && y == 0);
    }

    private boolean isOnYAxis() {
        return (x == 0 && y != 0);
    }

    private boolean isInMiddle() {
        return (x == 0 && y == 0);
    }

    String getPointDetails() {

        String pointLocation = "";

        if (isInFirstQuarter()) {
            pointLocation = " leży w I ćwiartce.";
        } else if (isInSecondQuarter()) {
            pointLocation = " leży w II ćwiartce.";
        } else if (isInThirdQuarter()) {
            pointLocation = " leży w III ćwiarce.";
        } else if (isInFourthQuarter()) {
            pointLocation = " leży w IV ćwiarce.";
        } else if (isOnXAxis()) {
            pointLocation = " leży na osi X.";
        } else if (isOnYAxis()) {
            pointLocation = " leży na osi Y.";
        } else if (isInMiddle()) {
            pointLocation = " leży wśrodku układu współrzędnych.";
        }

        return ("Punkt (" + x + ", " + y + ")" + pointLocation);
    }
}
