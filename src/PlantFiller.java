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
  private int S10549 = 1;
  private int S10359 = 1;
  private int S10276 = 1;
  private int S10367 = 1;
  private int S10462 = 1;
  private int S10379 = 1;
  private int S10521 = 1;
  private int S10470 = 1;
  private int S10547 = 1;
  private int S10529 = 1;
  private int S10523 = 1;
  private int S10537 = 1;
  private int S10545 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread10568(int [] tdone, int [] ends){
        switch(S10545){
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

  public void thread10567(int [] tdone, int [] ends){
        switch(S10537){
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

  public void thread10566(int [] tdone, int [] ends){
        switch(S10529){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S10523){
          case 0 : 
            S10523=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 60, column: 38
              currsigs.addElement(bottleAtPos2E);
              S10523=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S10523=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S10523=1;
            S10523=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 60, column: 38
              currsigs.addElement(bottleAtPos2E);
              S10523=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S10523=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10565(int [] tdone, int [] ends){
        switch(S10547){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread10566(tdone,ends);
        thread10567(tdone,ends);
        thread10568(tdone,ends);
        int biggest10569 = 0;
        if(ends[7]>=biggest10569){
          biggest10569=ends[7];
        }
        if(ends[8]>=biggest10569){
          biggest10569=ends[8];
        }
        if(ends[9]>=biggest10569){
          biggest10569=ends[9];
        }
        if(biggest10569 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest10569 == 0){
          S10547=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread10564(int [] tdone, int [] ends){
        switch(S10521){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S10470){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
              S10470=1;
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
              S10470=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 52, column: 20
                S10470=3;
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
              S10470=3;
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
              S10470=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
                S10470=1;
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

  public void thread10563(int [] tdone, int [] ends){
        switch(S10462){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S10379){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
              S10379=1;
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
              S10379=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 38, column: 20
                S10379=3;
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
              S10379=3;
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
              S10379=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
                S10379=1;
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

  public void thread10562(int [] tdone, int [] ends){
        switch(S10367){
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

  public void thread10561(int [] tdone, int [] ends){
        switch(S10359){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S10276){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 12, column: 21
              S10276=1;
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
              S10276=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 17, column: 20
                S10276=3;
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
              S10276=3;
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
              S10276=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 12, column: 21
                S10276=1;
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

  public void thread10558(int [] tdone, int [] ends){
        S10545=1;
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

  public void thread10557(int [] tdone, int [] ends){
        S10537=1;
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

  public void thread10556(int [] tdone, int [] ends){
        S10529=1;
    S10523=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 24
      bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 60, column: 38
      currsigs.addElement(bottleAtPos2E);
      S10523=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S10523=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread10555(int [] tdone, int [] ends){
        S10547=1;
    thread10556(tdone,ends);
    thread10557(tdone,ends);
    thread10558(tdone,ends);
    int biggest10559 = 0;
    if(ends[7]>=biggest10559){
      biggest10559=ends[7];
    }
    if(ends[8]>=biggest10559){
      biggest10559=ends[8];
    }
    if(ends[9]>=biggest10559){
      biggest10559=ends[9];
    }
    if(biggest10559 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread10554(int [] tdone, int [] ends){
        S10521=1;
    S10470=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
      S10470=1;
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

  public void thread10553(int [] tdone, int [] ends){
        S10462=1;
    S10379=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
      S10379=1;
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

  public void thread10552(int [] tdone, int [] ends){
        S10367=1;
    bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 27, column: 4
    currsigs.addElement(bottleAtPos2);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread10551(int [] tdone, int [] ends){
        S10359=1;
    S10276=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 12, column: 21
      S10276=1;
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
      switch(S10549){
        case 0 : 
          S10549=0;
          break RUN;
        
        case 1 : 
          S10549=2;
          S10549=2;
          injectorOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          injectorOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          thread10551(tdone,ends);
          thread10552(tdone,ends);
          thread10553(tdone,ends);
          thread10554(tdone,ends);
          thread10555(tdone,ends);
          int biggest10560 = 0;
          if(ends[2]>=biggest10560){
            biggest10560=ends[2];
          }
          if(ends[3]>=biggest10560){
            biggest10560=ends[3];
          }
          if(ends[4]>=biggest10560){
            biggest10560=ends[4];
          }
          if(ends[5]>=biggest10560){
            biggest10560=ends[5];
          }
          if(ends[6]>=biggest10560){
            biggest10560=ends[6];
          }
          if(biggest10560 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          injectorOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          injectorOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOn_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          inletOff_1.setClear();//sysj\plantFiller.sysj line: 9, column: 2
          thread10561(tdone,ends);
          thread10562(tdone,ends);
          thread10563(tdone,ends);
          thread10564(tdone,ends);
          thread10565(tdone,ends);
          int biggest10570 = 0;
          if(ends[2]>=biggest10570){
            biggest10570=ends[2];
          }
          if(ends[3]>=biggest10570){
            biggest10570=ends[3];
          }
          if(ends[4]>=biggest10570){
            biggest10570=ends[4];
          }
          if(ends[5]>=biggest10570){
            biggest10570=ends[5];
          }
          if(ends[6]>=biggest10570){
            biggest10570=ends[6];
          }
          if(biggest10570 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10570 == 0){
            S10549=0;
            active[1]=0;
            ends[1]=0;
            S10549=0;
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
