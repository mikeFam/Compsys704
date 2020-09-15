import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerConveyor extends ClockDomain{
  public ControllerConveyor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal motConveyorOnOffM = new Signal("motConveyorOnOffM", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S5268 = 1;
  private int S5201 = 1;
  private int S5167 = 1;
  private int S5154 = 1;
  private int S5251 = 1;
  private int S5213 = 1;
  private int S5266 = 1;
  private int S5265 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread5276(int [] tdone, int [] ends){
        switch(S5266){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S5265){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerConveyor.sysj line: 32, column: 9
              S5265=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerConveyor.sysj line: 34, column: 7
                selectM_1.setPresent();//sysj\controllerConveyor.sysj line: 35, column: 5
                currsigs.addElement(selectM_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerConveyor.sysj line: 38, column: 5
                currsigs.addElement(selectA_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerConveyor.sysj line: 34, column: 7
              selectM_1.setPresent();//sysj\controllerConveyor.sysj line: 35, column: 5
              currsigs.addElement(selectM_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerConveyor.sysj line: 38, column: 5
              currsigs.addElement(selectA_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5275(int [] tdone, int [] ends){
        switch(S5251){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S5213){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerConveyor.sysj line: 22, column: 9
              S5213=1;
              motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 25, column: 6
              currsigs.addElement(motConveyorOnOff);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(selectM_1.getprestatus()){//sysj\controllerConveyor.sysj line: 23, column: 10
              S5213=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              if(!bottleLeftPos5.getprestatus() && !bottleAtPos1.getprestatus()){//sysj\controllerConveyor.sysj line: 24, column: 11
                S5213=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 25, column: 6
                currsigs.addElement(motConveyorOnOff);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5274(int [] tdone, int [] ends){
        switch(S5201){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5167){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerConveyor.sysj line: 13, column: 10
              S5167=1;
              S5154=0;
              if(motConveyorOnOffM.getprestatus()){//sysj\controllerConveyor.sysj line: 15, column: 26
                motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 15, column: 45
                currsigs.addElement(motConveyorOnOff);
                S5154=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S5154=1;
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
            if(selectA_1.getprestatus()){//sysj\controllerConveyor.sysj line: 14, column: 10
              S5167=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S5154){
                case 0 : 
                  S5154=0;
                  if(motConveyorOnOffM.getprestatus()){//sysj\controllerConveyor.sysj line: 15, column: 26
                    motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 15, column: 45
                    currsigs.addElement(motConveyorOnOff);
                    S5154=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S5154=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  S5154=1;
                  S5154=0;
                  if(motConveyorOnOffM.getprestatus()){//sysj\controllerConveyor.sysj line: 15, column: 26
                    motConveyorOnOff.setPresent();//sysj\controllerConveyor.sysj line: 15, column: 45
                    currsigs.addElement(motConveyorOnOff);
                    S5154=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S5154=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5272(int [] tdone, int [] ends){
        S5266=1;
    S5265=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread5271(int [] tdone, int [] ends){
        S5251=1;
    S5213=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread5270(int [] tdone, int [] ends){
        S5201=1;
    S5167=0;
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
      switch(S5268){
        case 0 : 
          S5268=0;
          break RUN;
        
        case 1 : 
          S5268=2;
          S5268=2;
          selectM_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          thread5270(tdone,ends);
          thread5271(tdone,ends);
          thread5272(tdone,ends);
          int biggest5273 = 0;
          if(ends[2]>=biggest5273){
            biggest5273=ends[2];
          }
          if(ends[3]>=biggest5273){
            biggest5273=ends[3];
          }
          if(ends[4]>=biggest5273){
            biggest5273=ends[4];
          }
          if(biggest5273 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerConveyor.sysj line: 9, column: 2
          thread5274(tdone,ends);
          thread5275(tdone,ends);
          thread5276(tdone,ends);
          int biggest5277 = 0;
          if(ends[2]>=biggest5277){
            biggest5277=ends[2];
          }
          if(ends[3]>=biggest5277){
            biggest5277=ends[3];
          }
          if(ends[4]>=biggest5277){
            biggest5277=ends[4];
          }
          if(biggest5277 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5277 == 0){
            S5268=0;
            active[1]=0;
            ends[1]=0;
            S5268=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
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
          bottleAtLoad.gethook();
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          mode.gethook();
          motConveyorOnOffM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      mode.setpreclear();
      motConveyorOnOffM.setpreclear();
      motConveyorOnOff.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtLoad.getStatus() ? bottleAtLoad.setprepresent() : bottleAtLoad.setpreclear();
      bottleAtLoad.setpreval(bottleAtLoad.getValue());
      bottleAtLoad.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = motConveyorOnOffM.getStatus() ? motConveyorOnOffM.setprepresent() : motConveyorOnOffM.setpreclear();
      motConveyorOnOffM.setpreval(motConveyorOnOffM.getValue());
      motConveyorOnOffM.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtLoad.gethook();
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        mode.gethook();
        motConveyorOnOffM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
