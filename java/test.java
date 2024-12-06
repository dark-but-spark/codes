class Matrix{
    private int row;
    private int colunm;
    private double a[][];
    
    Matrix()
    {
    }

    Matrix(int row,int colunm,double value[][])
    {
        this.row=row;
        this.colunm=colunm;
        this.a=value;
    }

    Matrix(String s,int n) throws Exception
    {
        if(s=="I")
        {
            this.colunm=this.row=n;
            this.a= new double[n][n];
            for(int i=0;i<n;i++) for(int j=0;j<n;j++)
            {
                if(i==j) this.a[i][j]=1;
                else this.a[i][j]=0;
            }
        }
        else
        {
            throw new Exception("fuck Matrix");
        }
    }
    int height()
    {
        return this.row;
    }
    int width()
    {
        return this.colunm;
    }

    String print()
    {
        StringBuilder s=new StringBuilder();
        s.append("\r\n");
        for(int i=0;i<this.row;i++) for(int j=0;j<this.colunm;j++)
        {
            s.append(a[i][j]);
            if(j==this.colunm-1)
                s.append("\r\n");
            else 
                s.append(" ");
        }
        s.append("------------------");
        return s.toString();
    }
    public Matrix plus(Matrix that) throws Exception
    {
        if(this.row!=that.row||this.colunm!=that.colunm)
        {
            throw new Exception("fuck add");
        }
        else 
        {
            double result[][]=new double[this.row][this.colunm];
            for(int i=0;i<this.row;i++) for(int j=0;j<this.colunm;j++)
            {
                result[i][j]=this.a[i][j]+that.a[i][j];
            }
            return new Matrix(this.row,this.colunm,result);
       }
    }

}
class text{
    public static void main(String[] args) {
        double a[][] = {{1, 2, 1}, {2, 2, 3}, {2, 2, 0}};
        double b[][] = {{2}, {0}, {0}};
        double d[][] = {{2}, {0}, {5}};
        try 
        {
        Matrix A = new Matrix(a.length, a[0].length, a);
        Matrix B = new Matrix(b.length, b[0].length, b);
        Matrix C = new Matrix("I",3);
        Matrix D = new Matrix(d.length, d[0].length, d);
        Matrix E = new Matrix("I",2);
       
            System.out.println("A:" + A.print());
            System.out.println("B:" + B.print());
            System.out.println("C:" + C.print());
            System.out.println("D:" + D.print());
            System.out.println("A+C:"+A.plus(C).print());
            System.out.println("B+D:"+B.plus(D).print());
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}