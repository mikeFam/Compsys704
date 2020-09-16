import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerFiller extends ClockDomain{
  public ControllerFiller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal valveInjectorOnOffM = new Signal("valveInjectorOnOffM", Signal.INPUT);
  public Signal valveInletOnOffM = new Signal("valveInletOnOffM", Signal.INPUT);
  public Signal dosUnitValveRetractM = new Signal("dosUnitValveRetractM", Signal.INPUT);
  public Signal dosUnitValveExtendM = new Signal("dosUnitValveExtendM", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S7302 = 1;
  private int S6393 = 1;
  private int S6121 = 1;
  private int S6129 = 1;
  private int S6123 = 1;
  private int S6137 = 1;
  private int S6145 = 1;
  private int S6153 = 1;
  private int S7285 = 1;
  private int S6395 = 1;
  private int S6431 = 1;
  private int S6404 = 1;
  private int S6412 = 1;
  private int S6439 = 1;
  private int S6447 = 1;
  private int S7300 = 1;
  private int S7299 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread7335(int [] tdone, int [] ends){
        switch(S7300){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S7299){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerFiller.sysj line: 58, column: 9
              S7299=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 60, column: 7
                selectM_1.setPresent();//sysj\controllerFiller.sysj line: 61, column: 5
                currsigs.addElement(selectM_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerFiller.sysj line: 64, column: 5
                currsigs.addElement(selectA_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerFiller.sysj line: 60, column: 7
              selectM_1.setPresent();//sysj\controllerFiller.sysj line: 61, column: 5
              currsigs.addElement(selectM_1);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerFiller.sysj line: 64, column: 5
              currsigs.addElement(selectA_1);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7333(int [] tdone, int [] ends){
        switch(S6447){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
        currsigs.addElement(valveInletOnOff);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread7332(int [] tdone, int [] ends){
        switch(S6439){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
        currsigs.addElement(dosUnitValveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread7330(int [] tdone, int [] ends){
        S6447=1;
    System.out.println("InletOn");//sysj\controllerFiller.sysj line: 48, column: 7
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7329(int [] tdone, int [] ends){
        S6439=1;
    System.out.println("ValveExtend");//sysj\controllerFiller.sysj line: 44, column: 7
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7327(int [] tdone, int [] ends){
        switch(S6412){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 39, column: 6
        currsigs.addElement(valveInjectorOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread7326(int [] tdone, int [] ends){
        switch(S6404){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 35, column: 6
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread7324(int [] tdone, int [] ends){
        S6447=1;
    System.out.println("InletOn");//sysj\controllerFiller.sysj line: 48, column: 7
    valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 49, column: 6
    currsigs.addElement(valveInletOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread7323(int [] tdone, int [] ends){
        S6439=1;
    System.out.println("ValveExtend");//sysj\controllerFiller.sysj line: 44, column: 7
    dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 45, column: 6
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread7321(int [] tdone, int [] ends){
        S6412=1;
    System.out.println("InjectorOn");//sysj\controllerFiller.sysj line: 38, column: 7
    valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 39, column: 6
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread7320(int [] tdone, int [] ends){
        S6404=1;
    System.out.println("ValveRetract");//sysj\controllerFiller.sysj line: 34, column: 7
    dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 35, column: 6
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread7319(int [] tdone, int [] ends){
        switch(S7285){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S6395){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 29, column: 9
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerFiller.sysj line: 30, column: 3
              S6395=1;
              S6431=0;
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
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 31, column: 10
              S6395=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S6431){
                case 0 : 
                  if(bottleAtPos2.getprestatus()){//sysj\controllerFiller.sysj line: 32, column: 11
                    S6431=1;
                    thread7320(tdone,ends);
                    thread7321(tdone,ends);
                    int biggest7322 = 0;
                    if(ends[8]>=biggest7322){
                      biggest7322=ends[8];
                    }
                    if(ends[9]>=biggest7322){
                      biggest7322=ends[9];
                    }
                    if(biggest7322 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 1 : 
                  if(dosUnitFilled.getprestatus()){//sysj\controllerFiller.sysj line: 33, column: 11
                    System.out.println("InjectorOff");//sysj\controllerFiller.sysj line: 42, column: 5
                    S6431=2;
                    thread7323(tdone,ends);
                    thread7324(tdone,ends);
                    int biggest7325 = 0;
                    if(ends[10]>=biggest7325){
                      biggest7325=ends[10];
                    }
                    if(ends[11]>=biggest7325){
                      biggest7325=ends[11];
                    }
                    if(biggest7325 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    thread7326(tdone,ends);
                    thread7327(tdone,ends);
                    int biggest7328 = 0;
                    if(ends[8]>=biggest7328){
                      biggest7328=ends[8];
                    }
                    if(ends[9]>=biggest7328){
                      biggest7328=ends[9];
                    }
                    if(biggest7328 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest7328 == 0){
                      System.out.println("InjectorOff");//sysj\controllerFiller.sysj line: 42, column: 5
                      S6431=2;
                      thread7329(tdone,ends);
                      thread7330(tdone,ends);
                      int biggest7331 = 0;
                      if(ends[10]>=biggest7331){
                        biggest7331=ends[10];
                      }
                      if(ends[11]>=biggest7331){
                        biggest7331=ends[11];
                      }
                      if(biggest7331 == 1){
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                    }
                  }
                  break;
                
                case 2 : 
                  if(dosUnitEvac.getprestatus()){//sysj\controllerFiller.sysj line: 43, column: 11
                    System.out.println("InletOff");//sysj\controllerFiller.sysj line: 52, column: 5
                    S6395=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    thread7332(tdone,ends);
                    thread7333(tdone,ends);
                    int biggest7334 = 0;
                    if(ends[10]>=biggest7334){
                      biggest7334=ends[10];
                    }
                    if(ends[11]>=biggest7334){
                      biggest7334=ends[11];
                    }
                    if(biggest7334 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest7334 == 0){
                      System.out.println("InletOff");//sysj\controllerFiller.sysj line: 52, column: 5
                      S6395=0;
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

  public void thread7317(int [] tdone, int [] ends){
        switch(S6153){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtendM.getprestatus()){//sysj\controllerFiller.sysj line: 22, column: 26
          dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 22, column: 47
          currsigs.addElement(dosUnitValveExtend);
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

  public void thread7316(int [] tdone, int [] ends){
        switch(S6145){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetractM.getprestatus()){//sysj\controllerFiller.sysj line: 20, column: 26
          dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 20, column: 48
          currsigs.addElement(dosUnitValveRetract);
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

  public void thread7315(int [] tdone, int [] ends){
        switch(S6137){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(valveInletOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 18, column: 26
          valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 18, column: 44
          currsigs.addElement(valveInletOnOff);
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

  public void thread7314(int [] tdone, int [] ends){
        switch(S6129){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S6123){
          case 0 : 
            S6123=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S6123=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S6123=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S6123=1;
            S6123=0;
            if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
              valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
              currsigs.addElement(valveInjectorOnOff);
              S6123=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S6123=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7312(int [] tdone, int [] ends){
        S6153=1;
    if(dosUnitValveExtendM.getprestatus()){//sysj\controllerFiller.sysj line: 22, column: 26
      dosUnitValveExtend.setPresent();//sysj\controllerFiller.sysj line: 22, column: 47
      currsigs.addElement(dosUnitValveExtend);
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

  public void thread7311(int [] tdone, int [] ends){
        S6145=1;
    if(dosUnitValveRetractM.getprestatus()){//sysj\controllerFiller.sysj line: 20, column: 26
      dosUnitValveRetract.setPresent();//sysj\controllerFiller.sysj line: 20, column: 48
      currsigs.addElement(dosUnitValveRetract);
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

  public void thread7310(int [] tdone, int [] ends){
        S6137=1;
    if(valveInletOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 18, column: 26
      valveInletOnOff.setPresent();//sysj\controllerFiller.sysj line: 18, column: 44
      currsigs.addElement(valveInletOnOff);
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

  public void thread7309(int [] tdone, int [] ends){
        S6129=1;
    S6123=0;
    if(valveInjectorOnOffM.getprestatus()){//sysj\controllerFiller.sysj line: 16, column: 26
      valveInjectorOnOff.setPresent();//sysj\controllerFiller.sysj line: 16, column: 47
      currsigs.addElement(valveInjectorOnOff);
      S6123=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S6123=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread7308(int [] tdone, int [] ends){
        switch(S6393){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6121){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerFiller.sysj line: 13, column: 10
              System.out.println((mode.getpreval() == null ? null : ((Integer)mode.getpreval())));//sysj\controllerFiller.sysj line: 14, column: 4
              S6121=1;
              thread7309(tdone,ends);
              thread7310(tdone,ends);
              thread7311(tdone,ends);
              thread7312(tdone,ends);
              int biggest7313 = 0;
              if(ends[3]>=biggest7313){
                biggest7313=ends[3];
              }
              if(ends[4]>=biggest7313){
                biggest7313=ends[4];
              }
              if(ends[5]>=biggest7313){
                biggest7313=ends[5];
              }
              if(ends[6]>=biggest7313){
                biggest7313=ends[6];
              }
              if(biggest7313 == 1){
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
            if(selectA_1.getprestatus()){//sysj\controllerFiller.sysj line: 15, column: 10
              S6121=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread7314(tdone,ends);
              thread7315(tdone,ends);
              thread7316(tdone,ends);
              thread7317(tdone,ends);
              int biggest7318 = 0;
              if(ends[3]>=biggest7318){
                biggest7318=ends[3];
              }
              if(ends[4]>=biggest7318){
                biggest7318=ends[4];
              }
              if(ends[5]>=biggest7318){
                biggest7318=ends[5];
              }
              if(ends[6]>=biggest7318){
                biggest7318=ends[6];
              }
              if(biggest7318 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest7318 == 0){
                S6121=0;
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

  public void thread7306(int [] tdone, int [] ends){
        S7300=1;
    S7299=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread7305(int [] tdone, int [] ends){
        S7285=1;
    S6395=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread7304(int [] tdone, int [] ends){
        S6393=1;
    S6121=0;
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
      switch(S7302){
        case 0 : 
          S7302=0;
          break RUN;
        
        case 1 : 
          S7302=2;
          S7302=2;
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread7304(tdone,ends);
          thread7305(tdone,ends);
          thread7306(tdone,ends);
          int biggest7307 = 0;
          if(ends[2]>=biggest7307){
            biggest7307=ends[2];
          }
          if(ends[7]>=biggest7307){
            biggest7307=ends[7];
          }
          if(ends[12]>=biggest7307){
            biggest7307=ends[12];
          }
          if(biggest7307 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerFiller.sysj line: 9, column: 2
          thread7308(tdone,ends);
          thread7319(tdone,ends);
          thread7335(tdone,ends);
          int biggest7336 = 0;
          if(ends[2]>=biggest7336){
            biggest7336=ends[2];
          }
          if(ends[7]>=biggest7336){
            biggest7336=ends[7];
          }
          if(ends[12]>=biggest7336){
            biggest7336=ends[12];
          }
          if(biggest7336 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7336 == 0){
            S7302=0;
            active[1]=0;
            ends[1]=0;
            S7302=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          mode.gethook();
          valveInjectorOnOffM.gethook();
          valveInletOnOffM.gethook();
          dosUnitValveRetractM.gethook();
          dosUnitValveExtendM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      mode.setpreclear();
      valveInjectorOnOffM.setpreclear();
      valveInletOnOffM.setpreclear();
      dosUnitValveRetractM.setpreclear();
      dosUnitValveExtendM.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = valveInjectorOnOffM.getStatus() ? valveInjectorOnOffM.setprepresent() : valveInjectorOnOffM.setpreclear();
      valveInjectorOnOffM.setpreval(valveInjectorOnOffM.getValue());
      valveInjectorOnOffM.setClear();
      dummyint = valveInletOnOffM.getStatus() ? valveInletOnOffM.setprepresent() : valveInletOnOffM.setpreclear();
      valveInletOnOffM.setpreval(valveInletOnOffM.getValue());
      valveInletOnOffM.setClear();
      dummyint = dosUnitValveRetractM.getStatus() ? dosUnitValveRetractM.setprepresent() : dosUnitValveRetractM.setpreclear();
      dosUnitValveRetractM.setpreval(dosUnitValveRetractM.getValue());
      dosUnitValveRetractM.setClear();
      dummyint = dosUnitValveExtendM.getStatus() ? dosUnitValveExtendM.setprepresent() : dosUnitValveExtendM.setpreclear();
      dosUnitValveExtendM.setpreval(dosUnitValveExtendM.getValue());
      dosUnitValveExtendM.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        mode.gethook();
        valveInjectorOnOffM.gethook();
        valveInletOnOffM.gethook();
        dosUnitValveRetractM.gethook();
        dosUnitValveExtendM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
