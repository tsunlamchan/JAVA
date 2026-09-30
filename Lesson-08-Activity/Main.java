class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }
  String print(String answer){
	String result = answer;
	return result;
  }

  double FtoC(double fahrenheit){
    double result = (5/9.0)*(fahrenheit-32);
    return result;
  }

  double sphereVolume(double radius){
    double result = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
    return result;
  }

  double coneVolume(double radius, double height){
    double result = (1.0/3.0)*Math.PI*Math.pow(radius, 2)*height;
    return result;
  }

  double distance(double x1, double y1, double x2, double y2){
    double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    return result;
  }

}