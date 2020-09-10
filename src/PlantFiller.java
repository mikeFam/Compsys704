import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantFiller extends ClockDomain{
  public PlantFiller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  private Signal injectorOn_1;
  private Signal injectorOff_1;
  private Signal inletOn_1;
  private Signal inletOff_1;
  private int S9374 = 1;
  private int S9184 = 1;
  private int S9101 = 1;
  private int S9192 = 1;
  private int S9287 = 1;
  private int S9204 = 1;
  private int S9346 = 1;
  private int S9295 = 1;
  private int S9372 = 1;
  private int S9354 = 1;
  private int S9348 = 1;
  private int S9362 = 1;
  private int S9370 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread9393(int [] tdone, int [] ends){
        switch(S9370){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 64, column: 24
          dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 64, column: 39
          currsigs.addElement(dosUnitFilledE);
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
      
    }
  }

  public void thread9392(int [] tdone, int [] ends){
        switch(S9362){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 62, column: 24
          dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 62, column: 37
          currsigs.addElement(dosUnitEvacE);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread9391(int [] tdone, int [] ends){
        switch(S9354){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S9348){
          case 0 : 
            S9348=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 60, column: 38
              currsigs.addElement(bottleAtPos2E);
              S9348=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S9348=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S9348=1;
            S9348=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 60, column: 38
              currsigs.addElement(bottleAtPos2E);
              S9348=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S9348=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9390(int [] tdone, int [] ends){
        switch(S9372){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread9391(tdone,ends);
        thread9392(tdone,ends);
        thread9393(tdone,ends);
        int biggest9394 = 0;
        if(ends[7]>=biggest9394){
          biggest9394=ends[7];
        }
        if(ends[8]>=biggest9394){
          biggest9394=ends[8];
        }
        if(ends[9]>=biggest9394){
          biggest9394=ends[9];
        }
        if(biggest9394 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest9394 == 0){
          S9372=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread9389(int [] tdone, int [] ends){
        switch(S9346){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S9295){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
              S9295=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 49, column: 5
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 51, column: 10
              S9295=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 52, column: 20
                S9295=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 53, column: 5
                currsigs.addElement(dosUnitEvac);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 52, column: 20
              S9295=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 53, column: 5
              currsigs.addElement(dosUnitEvac);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 55, column: 10
              S9295=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
                S9295=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 49, column: 5
                currsigs.addElement(dosUnitFilled);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread9388(int [] tdone, int [] ends){
        switch(S9287){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S9204){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
              S9204=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOff_1.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
              currsigs.addElement(inletOff_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 37, column: 10
              S9204=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 38, column: 20
                S9204=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("inletOn");//sysj\plantFiller.sysj line: 39, column: 5
                inletOn_1.setPresent();//sysj\plantFiller.sysj line: 40, column: 5
                currsigs.addElement(inletOn_1);
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
          
          case 2 : 
            if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 38, column: 20
              S9204=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOn_1.setPresent();//sysj\plantFiller.sysj line: 40, column: 5
              currsigs.addElement(inletOn_1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 42, column: 10
              S9204=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
                S9204=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("inletOff");//sysj\plantFiller.sysj line: 34, column: 5
                inletOff_1.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
                currsigs.addElement(inletOff_1);
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
          
        }
        break;
      
    }
  }

  public void thread9387(int [] tdone, int [] ends){
        switch(S9192){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 27, column: 4
        currsigs.addElement(bottleAtPos2);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread9386(int [] tdone, int [] ends){
        switch(S9184){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S9101){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 12, column: 21
              S9101=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOff_1.setPresent();//sysj\plantFiller.sysj line: 14, column: 5
              currsigs.addElement(injectorOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 16, column: 10
              S9101=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 17, column: 20
                S9101=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("injectorOn");//sysj\plantFiller.sysj line: 18, column: 5
                injectorOn_1.setPresent();//sysj\plantFiller.sysj line: 19, column: 5
                currsigs.addElement(injectorOn_1);
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
          
          case 2 : 
            if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 17, column: 20
              S9101=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOn_1.setPresent();//sysj\plantFiller.sysj line: 19, column: 5
              currsigs.addElement(injectorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 21, column: 10
              S9101=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 12, column: 21
                S9101=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("injectorOff");//sysj\plantFiller.sysj line: 13, column: 5
                injectorOff_1.setPresent();//sysj\plantFiller.sysj line: 14, column: 5
                currsigs.addElement(injectorOff_1);
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
          
        }
        break;
      
    }
  }

  public void thread9383(int [] tdone, int [] ends){
        S9370=1;
    if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 64, column: 24
      dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 64, column: 39
      currsigs.addElement(dosUnitFilledE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread9382(int [] tdone, int [] ends){
        S9362=1;
    if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 62, column: 24
      dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 62, column: 37
      currsigs.addElement(dosUnitEvacE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread9381(int [] tdone, int [] ends){
        S9354=1;
    S9348=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 24
      bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 60, column: 38
      currsigs.addElement(bottleAtPos2E);
      S9348=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S9348=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread9380(int [] tdone, int [] ends){
        S9372=1;
    thread9381(tdone,ends);
    thread9382(tdone,ends);
    thread9383(tdone,ends);
    int biggest9384 = 0;
    if(ends[7]>=biggest9384){
      biggest9384=ends[7];
    }
    if(ends[8]>=biggest9384){
      biggest9384=ends[8];
    }
    if(ends[9]>=biggest9384){
      biggest9384=ends[9];
    }
    if(biggest9384 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread9379(int [] tdone, int [] ends){
        S9346=1;
    S9295=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
      S9295=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 49, column: 5
      currsigs.addElement(dosUnitFilled);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread9378(int [] tdone, int [] ends){
        S9287=1;
    S9204=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
      S9204=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      System.out.println("inletOff");//sysj\plantFiller.sysj line: 34, column: 5
      inletOff_1.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
      currsigs.addElement(inletOff_1);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread9377(int [] tdone, int [] ends){
        S9192=1;
    bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 27, column: 4
    currsigs.addElement(bottleAtPos2);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread9376(int [] tdone, int [] ends){
        S9184=1;
    S9101=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 12, column: 21
      S9101=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("injectorOff");//sysj\plantFiller.sysj line: 13, column: 5
      injectorOff_1.setPresent();//sysj\plantFiller.sysj line: 14, column: 5
      currsigs.addElement(injectorOff_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S9374){
        case 0 : 
          S9374=0;
          break RUN;
        
        case 1 : 
          S9374=2;
          S9374=2;
          injectorOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          injectorOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          thread9376(tdone,ends);
          thread9377(tdone,ends);
          thread9378(tdone,ends);
          thread9379(tdone,ends);
          thread9380(tdone,ends);
          int biggest9385 = 0;
          if(ends[2]>=biggest9385){
            biggest9385=ends[2];
          }
          if(ends[3]>=biggest9385){
            biggest9385=ends[3];
          }
          if(ends[4]>=biggest9385){
            biggest9385=ends[4];
          }
          if(ends[5]>=biggest9385){
            biggest9385=ends[5];
          }
          if(ends[6]>=biggest9385){
            biggest9385=ends[6];
          }
          if(biggest9385 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          injectorOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          injectorOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          thread9386(tdone,ends);
          thread9387(tdone,ends);
          thread9388(tdone,ends);
          thread9389(tdone,ends);
          thread9390(tdone,ends);
          int biggest9395 = 0;
          if(ends[2]>=biggest9395){
            biggest9395=ends[2];
          }
          if(ends[3]>=biggest9395){
            biggest9395=ends[3];
          }
          if(ends[4]>=biggest9395){
            biggest9395=ends[4];
          }
          if(ends[5]>=biggest9395){
            biggest9395=ends[5];
          }
          if(ends[6]>=biggest9395){
            biggest9395=ends[6];
          }
          if(biggest9395 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest9395 == 0){
            S9374=0;
            active[1]=0;
            ends[1]=0;
            S9374=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    injectorOn_1 = new Signal();
    injectorOff_1 = new Signal();
    inletOn_1 = new Signal();
    inletOff_1 = new Signal();
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
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      enable.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      bottleAtPos2E.setpreclear();
      dosUnitEvacE.setpreclear();
      dosUnitFilledE.setpreclear();
      injectorOn_1.setpreclear();
      injectorOff_1.setpreclear();
      inletOn_1.setpreclear();
      inletOff_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      injectorOn_1.setClear();
      injectorOff_1.setClear();
      inletOn_1.setClear();
      inletOff_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
