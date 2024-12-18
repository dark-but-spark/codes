class BFSForPush{
    private int a=[][];// n*m map 1 wall 0 air  20 people 10 box 2 end
    private int n,m;
    private int queueBox=new int[2][100010];
    private int queuePeople=new int[2][100010];
    private int lP,rP,lB,rB;
    int[][] d=new int[2][4]{{1,0,-1,0},{0,1,0,-1}};
    int s[2],e[2],box[2];
    public static void BFSPeople()
    {
        lP=rP=0;
        queuePeople[0][lP]=s[0];queuePeople[1][lP]=s[1];
        rP++;
        while(lP<rP)
        {
            int[] n=queuePeople[lP];
            lP++;
            for(int i=0;i<4;i++)
            
        }
    }
    public static void BFSBox()
    {
        lB=rB=0;
        queueBox[0][lB]=box[0];queueBox[1][lB]=box[1];
        rB++;
        while(lB<rB)
        {

        }
    }
    public static void main(String[] args) {
        n=10,m=10;//input part
        a=new int[10][10];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++)
        {
            if(a[i][j]==20)
            {
                s[0]=i;s[1]=j;
            }
            else if(a[i][j]==10)
            {
                box[0]=i;box[1]=j;
            }
            else if(a[i][j]==2)
            {
                e[0]=i;e[1]=j;
            }
        }
        BFSBox();
        
    }
}