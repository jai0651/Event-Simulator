

class Queue
{
    public int f;      // pointer to the first element
    private int count;      // current size 
    ArrayNode qarr = new ArrayNode();
    // Constructor to initialize a queue

	Queue(){
       ArrayNode n = new ArrayNode();
	   f = 0;
       count = 0;
	}
 
    public CustomerNode deque()
    {
	  CustomerNode z = qarr.get(f);f++;
        count--;
        return z;
    }
    
    public CustomerNode firstE(){
        CustomerNode y = qarr.get(f);
        return y; 
    }

    public void enque(CustomerNode nd)
    {
	   qarr.push(nd);
        count++;
    }
    public void insertFirst(CustomerNode z){
        qarr.set(f,z);f--;count++;
    }
    
    public void remove(){
        f++;count--;
    }
 
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }
}



class BurgerQ
{
    private int f;      // pointer to the first element
    private int count;      // current size 
    ArrayB qarr = new ArrayB();
    // Constructor to initialize a queue

	BurgerQ(){
       ArrayB n = new ArrayB();
	   f = 0;
       count = 0;
	}
 
    public Burger deque()
    {
	  Burger z = qarr.get(f);f++;
        count--;
        return z;
    }
    
    public Burger firstE(){
        Burger y = qarr.get(f);
        return y; 
    }

    public void enque(Burger nd)
    {
	   qarr.push(nd);
        count++;
    }
    public void insertFirst(Burger z){
        qarr.set(f,z);f--;count++;
    }
    
    public void remove(){
        f++;count--;
    }
 
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }
}


class ArrayB{
    public Burger[] arr= new Burger[1];
	public int size =0;
	public int size(){
		return size;
	}
	Burger get(int i){
		return arr[i];
	}
	public void set(int j , Burger node){
        //int i=0;
        if(size==2){
        //  CustomerNode[] s2 = new CustomerNode[2];
        //  arr = s2;
          arr[0] = node;
        //  r=1;
        } else {
		arr[j]=node;
	}
}
	public void push(Burger o){
        if(o!=null){
        if(size==arr.length){
            int t=2*size;
            Burger[] a= new Burger[t];
            for(int i=0;i<t/2;i++){
                a[i]=arr[i];
            }
            arr=a;
            arr[size]=o;size++;
        }
        else {
            size++;
            arr[size-1]=o;
        }
      }
    }    
}

//growable array
class ArrayNode{
    public CustomerNode[] arr= new CustomerNode[1];
	public int size =0;
	public int size(){
		return size;
	}
	CustomerNode get(int i){
		return arr[i];
	}
	public void set(int j , CustomerNode node){
        //int i=0;
        if(size==2){
        //  CustomerNode[] s2 = new CustomerNode[2];
        //  arr = s2;
          arr[0] = node;
        //  r=1;
        } else {
		arr[j]=node;
	}
}
	public void push(CustomerNode o){
        if(o!=null){
        if(size==arr.length){
            int t=2*size;
            CustomerNode[] a= new CustomerNode[t];
            for(int i=0;i<t/2;i++){
                a[i]=arr[i];
            }
            arr=a;
            arr[size]=o;size++;
        }
        else {
            size++;
            arr[size-1]=o;
        }
      }
    }
    public void removefirst(){
      CustomerNode[] z = new CustomerNode[size--];
        for(int i=0;i<size;i++){
            z[i]=z[i+1];
            arr=z;
        }
    }
    public int searchId(int Id){
        int ans=0;
        int i=0;
        for( i=0;i<size;i++){
            if(arr[i].id==Id) {
                ans = i;break;
            }
        }
        if(i==size) return -1;
        else{
            return ans;
        }
    }    
}


class Node {
   public Queue q ;
    public int counterNo=0;
  
    Node (){
		this.q = new Queue();
        
    }
    Node(int l){
        this.counterNo=l;
    }
    public int qlength(){
        return q.size();
    }
}


class MinHeap {

	// Member variables of this class
	public Node[] Heap;
	private int hplength;
    private int size;

   // private static final int FRONT = 1;

	// Constructor of this class
	MinHeap(int k)
	{
		this.hplength =k;
        this.size = k;
		Heap = new Node[k+1];
		Heap[0] =new Node(-1);
	}
    
    public int heapLength(){
        return hplength;
    }

	private int leftChild(int p) { return (2 * p); }

	// Returning the pition of the right child for the node currently
	private int rightChild(int p)
	{
		return (2 * p) + 1;
	}


    public boolean rightChildisExist(int q){
        if(hplength+1>rightChild(q)){
            return true;
        }
        else return false;
    }
	private boolean isLeaf(int p)
	{

		if (p > (size / 2) && p <= size) {
			return true;
		}

		return false;
    }

	private void swap(int fp, int sp)
	{

		Node tmp;
		tmp = Heap[fp];

		Heap[fp] = Heap[sp];
		Heap[sp] = tmp;
	}

	
	public void minHeapify(int p)
	{
		if (!isLeaf(p)) {
            if(rightChildisExist(p)){
			if (Heap[p].qlength()> Heap[leftChild(p)].qlength()
				|| Heap[p].qlength() > Heap[rightChild(p)].qlength()) {

				if (Heap[leftChild(p)].qlength()
					<= Heap[rightChild(p)].qlength()) {
					swap(p, leftChild(p));
					minHeapify(leftChild(p));
				}

				else {
					swap(p, rightChild(p));
					minHeapify(rightChild(p));
				}
			}
		}
        else{
            if(Heap[p].qlength()>Heap[leftChild(p)].qlength()){
                 swap(p,leftChild(p));
                 minHeapify(leftChild(p));
            }
     } 
     }
	}

}


class CustomerNode{
    public int id;
     public int arrivaltime;
    public int noOfBurger;
    public int noOfBurgerRemaining;
    public int customerWaitingTime;
    public int counterNoAssigned;
    public int counterLeavingtime;
    public int burgerOnGirdle;
    public int burgerWaitTimestart;
    public int totalBcookingTime;
    public int departureTime ;
    public int customerStatus;
    //public int bPutOnGtime;
    public int Bcooked;
    public int BFTputonBurger;
    BurgerQ  bgq;
     CustomerNode(int i,int t,int b){
         this.id =i;
         this.arrivaltime=t;
         this.noOfBurger=b;
         this.noOfBurgerRemaining=b;
         this.customerWaitingTime=t;
         this.customerStatus=t;
         this.bgq = new BurgerQ();
         int j = b;
         while(j>0){
             Burger f = new Burger(0);
             bgq.enque(f);
             j--;
         }
     }
     CustomerNode(){
         this.id=-1;
     }
     public void setCounterNo(int i){
         counterNoAssigned = i;
     }
     public int getCounterNo(){
              return counterNoAssigned;
     }
     public void setCounterLeavingtime(int l){
            counterLeavingtime =l;
     }
     public  void setBurgerOnGirdle(int b){
             burgerOnGirdle=b;
     }
     public void setDepartureTime(int d){
             departureTime=d;
     }
 }

class Griddle{
    BurgerQ grill;
    int bRemain;
    Queue line;
    Queue line2;

    Griddle(int m){
      this.grill=new BurgerQ();
      this.line2 = new Queue();
      this.line = new Queue();
      this.bRemain=m;
    }
}

class Burger{
   // public int id;
    public int bPutOnGtime;
    Burger(int b){
          this.bPutOnGtime=b;
    }
}

public class MMBurgers implements MMBurgersInterface {
    MinHeap arrivalQ ;
    int globalTime=0;
    Queue arrivlaQueue = new Queue();
    Queue aCQ = new Queue();
   // Queue girdle = new Queue();
    Griddle gR;
   // Queue sArr= new Queue();
    ArrayNode customerArr = new ArrayNode();
    int M , K;

    public boolean isEmpty(){
        boolean a= true;
        for(int i=1;i<=K;i++){
            if(arrivalQ.Heap[i].q.size()>0){
               a = false;
            }
        }
        if(gR.line.size()>0||gR.line2.size()>0||aCQ.size()>0){
            a=false;
            return a;
        }
        return a;
    } 
    
    public void setK(int k) throws IllegalNumberException{
        if(k<=0) throw new IllegalNumberException("wrong number");
        else{
            K=k;
            arrivalQ = new MinHeap(k);
            for(int i=1;i<=k;i++){
                
                arrivalQ.Heap[i]= new Node();
                arrivalQ.Heap[i].counterNo=i;
            }
        }	
    }   
    
    public void setM(int m) throws IllegalNumberException{
        if(m<=0) throw new IllegalNumberException("wrong number");
        else{
            gR = new Griddle(m);
            this.M=m;
        }
	    //throw new java.lang.UnsupportedOperationException("Not implemented yet.");	
    } 


    public void advanceTime(int t) throws IllegalNumberException{
        if(globalTime>t){ throw new IllegalNumberException("not correct time given");}
        else{
            while(globalTime<=t){
                int i=1;
                while(i<=arrivalQ.heapLength()){
                     Queue tempQ = arrivalQ.Heap[i].q;
                     if(tempQ.size()>0){
                         int cNo= arrivalQ.Heap[i].counterNo;
                         CustomerNode tn = tempQ.firstE();
                         if(tn.customerWaitingTime+cNo==globalTime){
                             //tn.customerWaitingTime+=cNo;
                             aCQ.enque(tn);
                             tempQ.remove();
                             arrivalQ.minHeapify(1);
                             if(tempQ.size()!=0){
                                 CustomerNode l =tempQ.firstE();
                                 l.customerWaitingTime=globalTime;
                             }
                             CustomerNode v = customerArr.get(customerArr.searchId(tn.id));
                             v.customerStatus = K+1;
                         }
                     }
                     i++;
                }
               
                if(aCQ.size()!=0){
                  while(aCQ.size()!=0){
                      CustomerNode b = aCQ.deque();
                      b.burgerWaitTimestart=globalTime;
                      b.counterLeavingtime=globalTime;
                      gR.line.enque(b);
                     // burgerWaiting+= b.noOfBurger;
                  }
                }

               while(!gR.line.isEmpty()){
              //  if(!gR.grill.isEmpty()){
                 //   int x=gR.grill.firstE().bPutOnGtime;
                    while(!gR.grill.isEmpty()){
                       int x= gR.grill.firstE().bPutOnGtime;
                            if(globalTime-x==10){
                                 gR.grill.remove();
                                 gR.bRemain++;
                                 int w = gR.bRemain;   //debug
                     
                                if(!gR.line2.isEmpty()){
                                    CustomerNode cte=gR.line2.firstE();
                                    cte.Bcooked++;
                                    int e = cte.Bcooked;   //debug
                                    if(cte.Bcooked==cte.noOfBurger){
                                        cte=gR.line2.deque();
                                        cte.customerWaitingTime=x+10;
                                        int p = cte.customerWaitingTime;   //debug
                                        cte.customerWaitingTime+=1;
                                        cte.customerStatus=K+2;
                                    }
                                }
                                else{
                                    CustomerNode cte=gR.line.firstE();
                                   // gR.line2.enque(cte);
                                    cte.Bcooked++;
                                    int u = cte.Bcooked;     //debug
                                    int o = cte.id;   //debug
                                }
                            }
                            else{
                                break;
                            }
                        }
                  //  }
                    while(gR.bRemain>0&&!gR.line.isEmpty()){
                         CustomerNode h = gR.line.firstE();
                        // int y = h.id;
                         if(h.noOfBurgerRemaining<=gR.bRemain){
                             Burger z = h.bgq.deque();
                             z.bPutOnGtime=globalTime;
                            // int r = z.bPutOnGtime;   //debug
                             gR.grill.enque(z);
                             gR.bRemain--;
                             h.noOfBurgerRemaining--;
                         }
                         if(h.noOfBurgerRemaining==0){
                            gR.line2.enque(gR.line.deque());
                         }
                         if(h.noOfBurgerRemaining>gR.bRemain){
                             Burger s = h.bgq.deque();
                             s.bPutOnGtime=globalTime;
                             gR.grill.enque(s);
                             h.noOfBurgerRemaining--;
                             gR.bRemain--;
                         }
                    }
                    if(gR.bRemain==0){
                        break;
                    }
                }

                if(gR.line.isEmpty()&&!gR.line2.isEmpty()&& globalTime>1){
                    while(!gR.grill.isEmpty()){
                        int x= gR.grill.firstE().bPutOnGtime;
                             if(globalTime-x==10){
                                  gR.grill.remove();
                                  gR.bRemain++;
                                //  int w = gR.bRemain;   //debug
                      
                                 if(!gR.line2.isEmpty()){
                                     CustomerNode cte=gR.line2.firstE();
                                     cte.Bcooked++;
                                   //  int e = cte.Bcooked;   //debug
                                     if(cte.Bcooked==cte.noOfBurger){
                                         cte=gR.line2.deque();
                                         cte.customerWaitingTime=x+10;
                                       //  int p = cte.customerWaitingTime;   //debug
                                         cte.customerWaitingTime+=1;
                                         cte.customerStatus=K+2;
                                     }
                                 }
                                 else{
                                     CustomerNode cte=gR.line.firstE();
                                    // gR.line2.enque(cte);
                                     cte.Bcooked++;
                                 }
                             }
                             else{
                                 break;
                             }
                         }
                  }
                globalTime++;
            }
            globalTime-=1;
          }
        }
  

    public void arriveCustomer(int id, int t, int numb) throws IllegalNumberException{
        if(id<0||numb<0||t<globalTime){    
            throw new IllegalNumberException("arrive customer error");
        }
        else{
            if(t==0){
            CustomerNode cN =new CustomerNode(id, t, numb);
           cN.counterNoAssigned=arrivalQ.Heap[1].counterNo;
           cN.customerStatus=cN.counterNoAssigned;
           arrivalQ.Heap[1].q.enque(cN);
           arrivalQ.minHeapify(1);
           customerArr.push(cN);
            }
            else{
                advanceTime(t);
                CustomerNode cN =new CustomerNode(id, t, numb);
                cN.counterNoAssigned=arrivalQ.Heap[1].counterNo;
                cN.customerStatus=cN.counterNoAssigned;
               arrivalQ.Heap[1].q.enque(cN);
               arrivalQ.minHeapify(1);
               customerArr.push(cN);
                }
            } 
        }
        

    public int customerState(int id, int t) throws IllegalNumberException{
        if(id<=0||t<globalTime){
            throw new IllegalNumberException("wrong customer state");
        }
        int p=customerArr.searchId(id);
        if(p==-1){ return 0; }
        else{
            CustomerNode c = customerArr.get(p);
            if(t==globalTime) return c.customerStatus;
            else{
            advanceTime(t);
           return c.customerStatus;
        } 
        }
    } 

    public int griddleState(int t) throws IllegalNumberException{
        if(t<globalTime){ throw new IllegalNumberException("girdle state error");}
	    else{
            if(t==globalTime){return M-gR.bRemain;}
            else{
            advanceTime(t);
            return M-gR.bRemain;
        }
    }
} 

    public int griddleWait(int t) throws IllegalNumberException{
        if(t<globalTime) throw new IllegalNumberException("girdle wait error");
        else{
            int burgerWaiting =0;
            if(t==globalTime){
                if(!gR.line.isEmpty()){
                   for(int i= gR.line.f;i<gR.line.qarr.size();i++){
                          burgerWaiting+=gR.line.qarr.get(i).noOfBurgerRemaining;
                   }
                   return burgerWaiting;
                }
                else return 0;
            }
            else{
              advanceTime(t);
              if(!gR.line.isEmpty()){
                for(int i= gR.line.f;i<gR.line.qarr.size();i++){
                       burgerWaiting+=gR.line.qarr.get(i).noOfBurgerRemaining;
                }
                return burgerWaiting;
             }
             else return 0;
        }
    }
    } 

    public int customerWaitTime(int id) throws IllegalNumberException{
        int p = customerArr.searchId(id);
        if(p==-1){throw new IllegalNumberException("customer wait time error");}
	    else{ 
            CustomerNode cn =customerArr.get(p);
            return cn.customerWaitingTime-cn.arrivaltime;
        }	
    } 

	public float avgWaitTime(){
        float avg;
        float sumtotal=0,totalCustomers=0;
        for(int i=0;i<customerArr.size;i++){
          int waitT = customerArr.get(i).customerWaitingTime;
            sumtotal+=waitT;
            totalCustomers++;
        }
        avg=(sumtotal/totalCustomers);
        return avg;
    } 
  
}
