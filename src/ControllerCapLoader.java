import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerCapLoader extends ClockDomain{
  public ControllerCapLoader(String name){super(name);}
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
  private int S1654 = 1;
  private int S1115 = 1;
  private int S909 = 1;
  private int S850 = 1;
  private int S844 = 1;
  private int S858 = 1;
  private int S866 = 1;
  private int S874 = 1;
  private int S1637 = 1;
  private int S1219 = 1;
  private int S1126 = 1;
  private int S1141 = 1;
  private int S1150 = 1;
  private int S1149 = 1;
  private int S1652 = 1;
  private int S1651 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread1678(int [] tdone, int [] ends){
        switch(S1652){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S1651){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerCapLoader.sysj line: 51, column: 9
              S1651=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapLoader.sysj line: 53, column: 7
                selectM_1.setPresent();//sysj\controllerCapLoader.sysj line: 54, column: 5
                currsigs.addElement(selectM_1);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerCapLoader.sysj line: 57, column: 5
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapLoader.sysj line: 53, column: 7
              selectM_1.setPresent();//sysj\controllerCapLoader.sysj line: 54, column: 5
              currsigs.addElement(selectM_1);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerCapLoader.sysj line: 57, column: 5
              currsigs.addElement(selectA_1);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1676(int [] tdone, int [] ends){
        switch(S1150){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S1149){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controllerCapLoader.sysj line: 43, column: 14
              S1149=1;
              armDest.setPresent();//sysj\controllerCapLoader.sysj line: 44, column: 6
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
            armDest.setPresent();//sysj\controllerCapLoader.sysj line: 44, column: 6
            currsigs.addElement(armDest);
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1675(int [] tdone, int [] ends){
        switch(S1141){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controllerCapLoader.sysj line: 41, column: 7
        currsigs.addElement(vacOn);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread1673(int [] tdone, int [] ends){
        S1150=1;
    S1149=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1672(int [] tdone, int [] ends){
        S1141=1;
    vacOn.setPresent();//sysj\controllerCapLoader.sysj line: 41, column: 7
    currsigs.addElement(vacOn);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1671(int [] tdone, int [] ends){
        switch(S1637){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S1219){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapLoader.sysj line: 28, column: 10
              S1219=1;
              S1126=0;
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
            if(selectM_1.getprestatus()){//sysj\controllerCapLoader.sysj line: 29, column: 10
              S1219=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S1126){
                case 0 : 
                  if(request.getprestatus() && !empty.getprestatus()){//sysj\controllerCapLoader.sysj line: 30, column: 11
                    S1126=1;
                    pusherExtend.setPresent();//sysj\controllerCapLoader.sysj line: 32, column: 6
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\controllerCapLoader.sysj line: 31, column: 11
                    S1126=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    pusherExtend.setPresent();//sysj\controllerCapLoader.sysj line: 32, column: 6
                    currsigs.addElement(pusherExtend);
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 2 : 
                  S1126=2;
                  S1126=3;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                  break;
                
                case 3 : 
                  if(pusherRetracted.getprestatus()){//sysj\controllerCapLoader.sysj line: 35, column: 11
                    S1126=4;
                    armSource.setPresent();//sysj\controllerCapLoader.sysj line: 37, column: 6
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
                
                case 4 : 
                  if(armAtSource.getprestatus()){//sysj\controllerCapLoader.sysj line: 36, column: 11
                    S1126=5;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    armSource.setPresent();//sysj\controllerCapLoader.sysj line: 37, column: 6
                    currsigs.addElement(armSource);
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 5 : 
                  S1126=5;
                  S1126=6;
                  thread1672(tdone,ends);
                  thread1673(tdone,ends);
                  int biggest1674 = 0;
                  if(ends[8]>=biggest1674){
                    biggest1674=ends[8];
                  }
                  if(ends[9]>=biggest1674){
                    biggest1674=ends[9];
                  }
                  if(biggest1674 == 1){
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 6 : 
                  if(armAtDest.getprestatus()){//sysj\controllerCapLoader.sysj line: 40, column: 11
                    S1219=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    thread1675(tdone,ends);
                    thread1676(tdone,ends);
                    int biggest1677 = 0;
                    if(ends[8]>=biggest1677){
                      biggest1677=ends[8];
                    }
                    if(ends[9]>=biggest1677){
                      biggest1677=ends[9];
                    }
                    if(biggest1677 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest1677 == 0){
                      S1219=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1669(int [] tdone, int [] ends){
        switch(S874){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\controllerCapLoader.sysj line: 21, column: 26
          armDest.setPresent();//sysj\controllerCapLoader.sysj line: 21, column: 36
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

  public void thread1668(int [] tdone, int [] ends){
        switch(S866){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(armSourceM.getprestatus()){//sysj\controllerCapLoader.sysj line: 19, column: 26
          armSource.setPresent();//sysj\controllerCapLoader.sysj line: 19, column: 38
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

  public void thread1667(int [] tdone, int [] ends){
        switch(S858){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\controllerCapLoader.sysj line: 17, column: 26
          vacOn.setPresent();//sysj\controllerCapLoader.sysj line: 17, column: 34
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

  public void thread1666(int [] tdone, int [] ends){
        switch(S850){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S844){
          case 0 : 
            S844=0;
            if(pusherExtendM.getprestatus()){//sysj\controllerCapLoader.sysj line: 15, column: 26
              pusherExtend.setPresent();//sysj\controllerCapLoader.sysj line: 15, column: 41
              currsigs.addElement(pusherExtend);
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S844=1;
            S844=0;
            if(pusherExtendM.getprestatus()){//sysj\controllerCapLoader.sysj line: 15, column: 26
              pusherExtend.setPresent();//sysj\controllerCapLoader.sysj line: 15, column: 41
              currsigs.addElement(pusherExtend);
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1664(int [] tdone, int [] ends){
        S874=1;
    if(armDestM.getprestatus()){//sysj\controllerCapLoader.sysj line: 21, column: 26
      armDest.setPresent();//sysj\controllerCapLoader.sysj line: 21, column: 36
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

  public void thread1663(int [] tdone, int [] ends){
        S866=1;
    if(armSourceM.getprestatus()){//sysj\controllerCapLoader.sysj line: 19, column: 26
      armSource.setPresent();//sysj\controllerCapLoader.sysj line: 19, column: 38
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

  public void thread1662(int [] tdone, int [] ends){
        S858=1;
    if(vacOnM.getprestatus()){//sysj\controllerCapLoader.sysj line: 17, column: 26
      vacOn.setPresent();//sysj\controllerCapLoader.sysj line: 17, column: 34
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

  public void thread1661(int [] tdone, int [] ends){
        S850=1;
    S844=0;
    if(pusherExtendM.getprestatus()){//sysj\controllerCapLoader.sysj line: 15, column: 26
      pusherExtend.setPresent();//sysj\controllerCapLoader.sysj line: 15, column: 41
      currsigs.addElement(pusherExtend);
      S844=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S844=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1660(int [] tdone, int [] ends){
        switch(S1115){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S909){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerCapLoader.sysj line: 13, column: 10
              S909=1;
              thread1661(tdone,ends);
              thread1662(tdone,ends);
              thread1663(tdone,ends);
              thread1664(tdone,ends);
              int biggest1665 = 0;
              if(ends[3]>=biggest1665){
                biggest1665=ends[3];
              }
              if(ends[4]>=biggest1665){
                biggest1665=ends[4];
              }
              if(ends[5]>=biggest1665){
                biggest1665=ends[5];
              }
              if(ends[6]>=biggest1665){
                biggest1665=ends[6];
              }
              if(biggest1665 == 1){
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
            if(selectA_1.getprestatus()){//sysj\controllerCapLoader.sysj line: 14, column: 10
              S909=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1666(tdone,ends);
              thread1667(tdone,ends);
              thread1668(tdone,ends);
              thread1669(tdone,ends);
              int biggest1670 = 0;
              if(ends[3]>=biggest1670){
                biggest1670=ends[3];
              }
              if(ends[4]>=biggest1670){
                biggest1670=ends[4];
              }
              if(ends[5]>=biggest1670){
                biggest1670=ends[5];
              }
              if(ends[6]>=biggest1670){
                biggest1670=ends[6];
              }
              if(biggest1670 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1670 == 0){
                S909=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1658(int [] tdone, int [] ends){
        S1652=1;
    S1651=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1657(int [] tdone, int [] ends){
        S1637=1;
    S1219=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1656(int [] tdone, int [] ends){
        S1115=1;
    S909=0;
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
      switch(S1654){
        case 0 : 
          S1654=0;
          break RUN;
        
        case 1 : 
          S1654=2;
          S1654=2;
          selectM_1.setClear();//sysj\controllerCapLoader.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapLoader.sysj line: 9, column: 2
          thread1656(tdone,ends);
          thread1657(tdone,ends);
          thread1658(tdone,ends);
          int biggest1659 = 0;
          if(ends[2]>=biggest1659){
            biggest1659=ends[2];
          }
          if(ends[7]>=biggest1659){
            biggest1659=ends[7];
          }
          if(ends[10]>=biggest1659){
            biggest1659=ends[10];
          }
          if(biggest1659 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerCapLoader.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapLoader.sysj line: 9, column: 2
          thread1660(tdone,ends);
          thread1671(tdone,ends);
          thread1678(tdone,ends);
          int biggest1679 = 0;
          if(ends[2]>=biggest1679){
            biggest1679=ends[2];
          }
          if(ends[7]>=biggest1679){
            biggest1679=ends[7];
          }
          if(ends[10]>=biggest1679){
            biggest1679=ends[10];
          }
          if(biggest1679 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1679 == 0){
            S1654=0;
            active[1]=0;
            ends[1]=0;
            S1654=0;
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
