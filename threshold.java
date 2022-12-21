public class threshold {
    public static void main(String[] args) {
        double[][] sample = {
            {1.2, 1.3, 4.5, 6.9},
            {5.4,3.8,9.4,7.3,6.8},
            {1.3,1.6,7.4,4.9,7.8},
            {24.4,17.3,16.9,4.9,10.9}};
            findFigure(sample, 2.4);
        }
        public static double[][] findFigure(double[][] picture, double threshold){
            int maxRow = picture.length;
            int maxCol = picture[0].length;

            double[][] newPicture = new double[maxRow][maxCol];
            double sum = 0.0;
            for(int i=0; i<maxRow; i++){
                for(int j=0; j<maxCol; j++){
                sum += picture[i][j];
            }
            }
            double average = sum/(maxRow*maxCol);
            double trigger = average * threshold;
            System.out.println("average is " + average + " anything above  "+ trigger+ " will be 1.0");
            for(int i=0; i<maxRow; i++){
            for(int j=0; j<maxCol; j++){
            if( picture[i][j] > trigger){
            newPicture[i][j]=1.0;
            } else {
            newPicture[i][j]= 0.0;
        }
        }
        }
        return newPicture;
    }
}