import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S307 = 1;
  private int S68 = 1;
  private int S67 = 1;
  private int S10 = 1;
  private int S4 = 1;
  private int S18 = 1;
  private int S26 = 1;
  private int S34 = 1;
  private int S278 = 1;
  private int S72 = 1;
  private int S95 = 1;
  private int S104 = 1;
  private int S103 = 1;
  private int S305 = 1;
  private int S304 = 1;
  private int S283 = 1;
  private int S282 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread331(int [] tdone, int [] ends){
        switch(S305){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S304){
          case 0 : 
            if(mode.getprestatus()){//sysj\controller.sysj line: 45, column: 9
              S304=1;
              S283=0;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 47, column: 7
                S282=0;
                selectM_1.setPresent();//sysj\controller.sysj line: 48, column: 5
                currsigs.addElement(selectM_1);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S282=1;
                selectA_1.setPresent();//sysj\controller.sysj line: 52, column: 5
                currsigs.addElement(selectA_1);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            switch(S283){
              case 0 : 
                switch(S282){
                  case 0 : 
                    S283=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                    break;
                  
                  case 1 : 
                    S283=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S283=1;
                S283=0;
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 47, column: 7
                  S282=0;
                  selectM_1.setPresent();//sysj\controller.sysj line: 48, column: 5
                  currsigs.addElement(selectM_1);
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S282=1;
                  selectA_1.setPresent();//sysj\controller.sysj line: 52, column: 5
                  currsigs.addElement(selectA_1);
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread329(int [] tdone, int [] ends){
        switch(S104){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S103){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 38, column: 13
              S103=1;
              armDest.setPresent();//sysj\controller.sysj line: 39, column: 5
              currsigs.addElement(armDest);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            armDest.setPresent();//sysj\controller.sysj line: 39, column: 5
            currsigs.addElement(armDest);
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread328(int [] tdone, int [] ends){
        switch(S95){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 36, column: 6
        currsigs.addElement(vacOn);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread326(int [] tdone, int [] ends){
        S104=1;
    S103=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread325(int [] tdone, int [] ends){
        S95=1;
    vacOn.setPresent();//sysj\controller.sysj line: 36, column: 6
    currsigs.addElement(vacOn);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread324(int [] tdone, int [] ends){
        switch(S278){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S72){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controller.sysj line: 24, column: 10
              S72=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(request.getprestatus() && !empty.getprestatus()){//sysj\controller.sysj line: 25, column: 10
              S72=2;
              pusherExtend.setPresent();//sysj\controller.sysj line: 27, column: 5
              currsigs.addElement(pusherExtend);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 2 : 
            if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 26, column: 10
              S72=3;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              pusherExtend.setPresent();//sysj\controller.sysj line: 27, column: 5
              currsigs.addElement(pusherExtend);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 3 : 
            S72=3;
            S72=4;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 4 : 
            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 30, column: 10
              S72=5;
              armSource.setPresent();//sysj\controller.sysj line: 32, column: 5
              currsigs.addElement(armSource);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 5 : 
            if(armAtSource.getprestatus()){//sysj\controller.sysj line: 31, column: 10
              S72=6;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              armSource.setPresent();//sysj\controller.sysj line: 32, column: 5
              currsigs.addElement(armSource);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 6 : 
            S72=6;
            S72=7;
            thread325(tdone,ends);
            thread326(tdone,ends);
            int biggest327 = 0;
            if(ends[8]>=biggest327){
              biggest327=ends[8];
            }
            if(ends[9]>=biggest327){
              biggest327=ends[9];
            }
            if(biggest327 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 7 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 35, column: 10
              S72=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              thread328(tdone,ends);
              thread329(tdone,ends);
              int biggest330 = 0;
              if(ends[8]>=biggest330){
                biggest330=ends[8];
              }
              if(ends[9]>=biggest330){
                biggest330=ends[9];
              }
              if(biggest330 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              //FINXME code
              if(biggest330 == 0){
                S72=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread322(int [] tdone, int [] ends){
        switch(S34){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\controller.sysj line: 19, column: 24
          armDest.setPresent();//sysj\controller.sysj line: 19, column: 34
          currsigs.addElement(armDest);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread321(int [] tdone, int [] ends){
        switch(S26){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(armSourceM.getprestatus()){//sysj\controller.sysj line: 17, column: 24
          armSource.setPresent();//sysj\controller.sysj line: 17, column: 36
          currsigs.addElement(armSource);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread320(int [] tdone, int [] ends){
        switch(S18){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 15, column: 24
          vacOn.setPresent();//sysj\controller.sysj line: 15, column: 32
          currsigs.addElement(vacOn);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread319(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4){
          case 0 : 
            S4=0;
            if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 13, column: 24
              pusherExtend.setPresent();//sysj\controller.sysj line: 13, column: 39
              currsigs.addElement(pusherExtend);
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S4=1;
            S4=0;
            if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 13, column: 24
              pusherExtend.setPresent();//sysj\controller.sysj line: 13, column: 39
              currsigs.addElement(pusherExtend);
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread317(int [] tdone, int [] ends){
        S34=1;
    if(armDestM.getprestatus()){//sysj\controller.sysj line: 19, column: 24
      armDest.setPresent();//sysj\controller.sysj line: 19, column: 34
      currsigs.addElement(armDest);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread316(int [] tdone, int [] ends){
        S26=1;
    if(armSourceM.getprestatus()){//sysj\controller.sysj line: 17, column: 24
      armSource.setPresent();//sysj\controller.sysj line: 17, column: 36
      currsigs.addElement(armSource);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread315(int [] tdone, int [] ends){
        S18=1;
    if(vacOnM.getprestatus()){//sysj\controller.sysj line: 15, column: 24
      vacOn.setPresent();//sysj\controller.sysj line: 15, column: 32
      currsigs.addElement(vacOn);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread314(int [] tdone, int [] ends){
        S10=1;
    S4=0;
    if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 13, column: 24
      pusherExtend.setPresent();//sysj\controller.sysj line: 13, column: 39
      currsigs.addElement(pusherExtend);
      S4=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S4=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread313(int [] tdone, int [] ends){
        switch(S68){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S67){
          case 0 : 
            if(selectM_1.getprestatus() && !request.getprestatus()){//sysj\controller.sysj line: 12, column: 9
              S67=1;
              thread314(tdone,ends);
              thread315(tdone,ends);
              thread316(tdone,ends);
              thread317(tdone,ends);
              int biggest318 = 0;
              if(ends[3]>=biggest318){
                biggest318=ends[3];
              }
              if(ends[4]>=biggest318){
                biggest318=ends[4];
              }
              if(ends[5]>=biggest318){
                biggest318=ends[5];
              }
              if(ends[6]>=biggest318){
                biggest318=ends[6];
              }
              if(biggest318 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            thread319(tdone,ends);
            thread320(tdone,ends);
            thread321(tdone,ends);
            thread322(tdone,ends);
            int biggest323 = 0;
            if(ends[3]>=biggest323){
              biggest323=ends[3];
            }
            if(ends[4]>=biggest323){
              biggest323=ends[4];
            }
            if(ends[5]>=biggest323){
              biggest323=ends[5];
            }
            if(ends[6]>=biggest323){
              biggest323=ends[6];
            }
            if(biggest323 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest323 == 0){
              S68=0;
              active[2]=0;
              ends[2]=0;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread311(int [] tdone, int [] ends){
        S305=1;
    S304=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread310(int [] tdone, int [] ends){
        S278=1;
    S72=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread309(int [] tdone, int [] ends){
        S68=1;
    S67=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S307){
        case 0 : 
          S307=0;
          break RUN;
        
        case 1 : 
          S307=2;
          S307=2;
          selectM_1.setClear();//sysj\controller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controller.sysj line: 9, column: 2
          thread309(tdone,ends);
          thread310(tdone,ends);
          thread311(tdone,ends);
          int biggest312 = 0;
          if(ends[2]>=biggest312){
            biggest312=ends[2];
          }
          if(ends[7]>=biggest312){
            biggest312=ends[7];
          }
          if(ends[10]>=biggest312){
            biggest312=ends[10];
          }
          if(biggest312 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controller.sysj line: 9, column: 2
          thread313(tdone,ends);
          thread324(tdone,ends);
          thread331(tdone,ends);
          int biggest332 = 0;
          if(ends[2]>=biggest332){
            biggest332=ends[2];
          }
          if(ends[7]>=biggest332){
            biggest332=ends[7];
          }
          if(ends[10]>=biggest332){
            biggest332=ends[10];
          }
          if(biggest332 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest332 == 0){
            S307=0;
            active[1]=0;
            ends[1]=0;
            S307=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    selectM_1 = new Signal();
    selectA_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
