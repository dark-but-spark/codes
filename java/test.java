class Matrix{
    private int row;
    private int colunm;
    private double a[][];
    
    Matrix()
    {
    }
    // 一般矩阵的初始化
    Matrix(int row,int colunm,double value[][])
    {
        this.row=row;
        this.colunm=colunm;
        this.a=value;
    }

    int row()
    {
        return this.row;
    }
    int colunm()
    {
        return this.colunm;
    }

    String print()
    {
        StringBuilder s=new StringBuilder();
        s.append("\r\n");
        for(int i=1;i<=this.row;i++) for(int j=1;j<=this.colunm;j++)
        {
            s.append(a[i][j]);
            if(j==this.colunm)
                s.append("\r\n");
            else 
                s.append(" ");
        }
        s.append("------------------");
        return s.toString();
    }

}
class text{
    public static void main(String[] args) {
        double a[][] = {{1, 2, 1}, {2, 2, 3}, {2, 2, 0}};
        double b[][] = {{2}, {0}, {0}};
        Matrix A = new Matrix(a.length, a[0].length, a);
        Matrix B = new Matrix(b.length, b[0].length, b);
        System.out.println("Matrix A(矩阵 A):" + A.print());
        System.out.println("Matrix B(矩阵 B):" + B.print());
    }
}