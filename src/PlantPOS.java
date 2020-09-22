import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantPOS extends ClockDomain{
  public PlantPOS(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal jobDone = new Signal("jobDone", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal injectorOff = new Signal("injectorOff", Signal.OUTPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal inletOff = new Signal("inletOff", Signal.OUTPUT);
  public Signal jobDoneN = new Signal("jobDoneN", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  public Signal injectorOnE = new Signal("injectorOnE", Signal.OUTPUT);
  public Signal injectorOffE = new Signal("injectorOffE", Signal.OUTPUT);
  public Signal inletOnE = new Signal("inletOnE", Signal.OUTPUT);
  public Signal inletOffE = new Signal("inletOffE", Signal.OUTPUT);
  public Signal jobDoneE = new Signal("jobDoneE", Signal.OUTPUT);
  private int S17489 = 1;
  private int S16943 = 1;
  private int S16892 = 1;
  private int S17002 = 1;
  private int S16951 = 1;
  private int S17061 = 1;
  private int S17010 = 1;
  private int S17120 = 1;
  private int S17069 = 1;
  private int S17186 = 1;
  private int S17128 = 1;
  private int S17122 = 1;
  private int S17136 = 1;
  private int S17144 = 1;
  private int S17152 = 1;
  private int S17160 = 1;
  private int S17168 = 1;
  private int S17176 = 1;
  private int S17184 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread17518(int [] tdone, int [] ends){
        switch(S17184){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(jobDoneN.getprestatus()){//sysj\plantPOS.sysj line: 83, column: 24
          jobDoneE.setPresent();//sysj\plantPOS.sysj line: 83, column: 34
          currsigs.addElement(jobDoneE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread17517(int [] tdone, int [] ends){
        switch(S17176){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(inletOff.getprestatus()){//sysj\plantPOS.sysj line: 81, column: 24
          inletOffE.setPresent();//sysj\plantPOS.sysj line: 81, column: 34
          currsigs.addElement(inletOffE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread17516(int [] tdone, int [] ends){
        switch(S17168){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(inletOn.getprestatus()){//sysj\plantPOS.sysj line: 79, column: 24
          inletOnE.setPresent();//sysj\plantPOS.sysj line: 79, column: 33
          currsigs.addElement(inletOnE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread17515(int [] tdone, int [] ends){
        switch(S17160){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(injectorOff.getprestatus()){//sysj\plantPOS.sysj line: 77, column: 24
          injectorOffE.setPresent();//sysj\plantPOS.sysj line: 77, column: 37
          currsigs.addElement(injectorOffE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread17514(int [] tdone, int [] ends){
        switch(S17152){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(injectorOn.getprestatus()){//sysj\plantPOS.sysj line: 75, column: 24
          injectorOnE.setPresent();//sysj\plantPOS.sysj line: 75, column: 36
          currsigs.addElement(injectorOnE);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread17513(int [] tdone, int [] ends){
        switch(S17144){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plantPOS.sysj line: 73, column: 24
          dosUnitFilledE.setPresent();//sysj\plantPOS.sysj line: 73, column: 39
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

  public void thread17512(int [] tdone, int [] ends){
        switch(S17136){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plantPOS.sysj line: 71, column: 24
          dosUnitEvacE.setPresent();//sysj\plantPOS.sysj line: 71, column: 37
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

  public void thread17511(int [] tdone, int [] ends){
        switch(S17128){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S17122){
          case 0 : 
            S17122=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantPOS.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantPOS.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S17122=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S17122=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S17122=1;
            S17122=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantPOS.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantPOS.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S17122=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S17122=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread17510(int [] tdone, int [] ends){
        switch(S17186){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread17511(tdone,ends);
        thread17512(tdone,ends);
        thread17513(tdone,ends);
        thread17514(tdone,ends);
        thread17515(tdone,ends);
        thread17516(tdone,ends);
        thread17517(tdone,ends);
        thread17518(tdone,ends);
        int biggest17519 = 0;
        if(ends[7]>=biggest17519){
          biggest17519=ends[7];
        }
        if(ends[8]>=biggest17519){
          biggest17519=ends[8];
        }
        if(ends[9]>=biggest17519){
          biggest17519=ends[9];
        }
        if(ends[10]>=biggest17519){
          biggest17519=ends[10];
        }
        if(ends[11]>=biggest17519){
          biggest17519=ends[11];
        }
        if(ends[12]>=biggest17519){
          biggest17519=ends[12];
        }
        if(ends[13]>=biggest17519){
          biggest17519=ends[13];
        }
        if(ends[14]>=biggest17519){
          biggest17519=ends[14];
        }
        if(biggest17519 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest17519 == 0){
          S17186=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread17509(int [] tdone, int [] ends){
        switch(S17120){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S17069){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 57, column: 20
              S17069=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plantPOS.sysj line: 58, column: 5
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 60, column: 10
              S17069=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 61, column: 20
                S17069=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitEvac.setPresent();//sysj\plantPOS.sysj line: 62, column: 5
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
            if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 61, column: 20
              S17069=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plantPOS.sysj line: 62, column: 5
              currsigs.addElement(dosUnitEvac);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 64, column: 10
              S17069=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 57, column: 20
                S17069=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitFilled.setPresent();//sysj\plantPOS.sysj line: 58, column: 5
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

  public void thread17508(int [] tdone, int [] ends){
        switch(S17061){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S17010){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 44, column: 21
              S17010=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOff.setPresent();//sysj\plantPOS.sysj line: 45, column: 5
              currsigs.addElement(inletOff);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 47, column: 10
              S17010=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 48, column: 20
                S17010=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                inletOn.setPresent();//sysj\plantPOS.sysj line: 49, column: 5
                currsigs.addElement(inletOn);
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
            if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 48, column: 20
              S17010=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOn.setPresent();//sysj\plantPOS.sysj line: 49, column: 5
              currsigs.addElement(inletOn);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 51, column: 10
              S17010=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 44, column: 21
                S17010=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                inletOff.setPresent();//sysj\plantPOS.sysj line: 45, column: 5
                currsigs.addElement(inletOff);
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

  public void thread17507(int [] tdone, int [] ends){
        switch(S17002){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S16951){
          case 0 : 
            if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 31, column: 21
              S16951=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\plantPOS.sysj line: 32, column: 5
              currsigs.addElement(bottleAtPos2);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 34, column: 10
              S16951=2;
              if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 35, column: 21
                S16951=3;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                jobDoneN.setPresent();//sysj\plantPOS.sysj line: 36, column: 5
                currsigs.addElement(jobDoneN);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 35, column: 21
              S16951=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              jobDoneN.setPresent();//sysj\plantPOS.sysj line: 36, column: 5
              currsigs.addElement(jobDoneN);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 38, column: 10
              S16951=0;
              if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 31, column: 21
                S16951=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                bottleAtPos2.setPresent();//sysj\plantPOS.sysj line: 32, column: 5
                currsigs.addElement(bottleAtPos2);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread17506(int [] tdone, int [] ends){
        switch(S16943){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S16892){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 18, column: 21
              S16892=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOff.setPresent();//sysj\plantPOS.sysj line: 19, column: 5
              currsigs.addElement(injectorOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 21, column: 10
              S16892=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 22, column: 20
                S16892=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOn.setPresent();//sysj\plantPOS.sysj line: 23, column: 5
                currsigs.addElement(injectorOn);
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
            if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 22, column: 20
              S16892=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOn.setPresent();//sysj\plantPOS.sysj line: 23, column: 5
              currsigs.addElement(injectorOn);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 25, column: 10
              S16892=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 18, column: 21
                S16892=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOff.setPresent();//sysj\plantPOS.sysj line: 19, column: 5
                currsigs.addElement(injectorOff);
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

  public void thread17503(int [] tdone, int [] ends){
        S17184=1;
    if(jobDoneN.getprestatus()){//sysj\plantPOS.sysj line: 83, column: 24
      jobDoneE.setPresent();//sysj\plantPOS.sysj line: 83, column: 34
      currsigs.addElement(jobDoneE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread17502(int [] tdone, int [] ends){
        S17176=1;
    if(inletOff.getprestatus()){//sysj\plantPOS.sysj line: 81, column: 24
      inletOffE.setPresent();//sysj\plantPOS.sysj line: 81, column: 34
      currsigs.addElement(inletOffE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread17501(int [] tdone, int [] ends){
        S17168=1;
    if(inletOn.getprestatus()){//sysj\plantPOS.sysj line: 79, column: 24
      inletOnE.setPresent();//sysj\plantPOS.sysj line: 79, column: 33
      currsigs.addElement(inletOnE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread17500(int [] tdone, int [] ends){
        S17160=1;
    if(injectorOff.getprestatus()){//sysj\plantPOS.sysj line: 77, column: 24
      injectorOffE.setPresent();//sysj\plantPOS.sysj line: 77, column: 37
      currsigs.addElement(injectorOffE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread17499(int [] tdone, int [] ends){
        S17152=1;
    if(injectorOn.getprestatus()){//sysj\plantPOS.sysj line: 75, column: 24
      injectorOnE.setPresent();//sysj\plantPOS.sysj line: 75, column: 36
      currsigs.addElement(injectorOnE);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread17498(int [] tdone, int [] ends){
        S17144=1;
    if(dosUnitFilled.getprestatus()){//sysj\plantPOS.sysj line: 73, column: 24
      dosUnitFilledE.setPresent();//sysj\plantPOS.sysj line: 73, column: 39
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

  public void thread17497(int [] tdone, int [] ends){
        S17136=1;
    if(dosUnitEvac.getprestatus()){//sysj\plantPOS.sysj line: 71, column: 24
      dosUnitEvacE.setPresent();//sysj\plantPOS.sysj line: 71, column: 37
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

  public void thread17496(int [] tdone, int [] ends){
        S17128=1;
    S17122=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantPOS.sysj line: 69, column: 24
      bottleAtPos2E.setPresent();//sysj\plantPOS.sysj line: 69, column: 38
      currsigs.addElement(bottleAtPos2E);
      S17122=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S17122=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread17495(int [] tdone, int [] ends){
        S17186=1;
    thread17496(tdone,ends);
    thread17497(tdone,ends);
    thread17498(tdone,ends);
    thread17499(tdone,ends);
    thread17500(tdone,ends);
    thread17501(tdone,ends);
    thread17502(tdone,ends);
    thread17503(tdone,ends);
    int biggest17504 = 0;
    if(ends[7]>=biggest17504){
      biggest17504=ends[7];
    }
    if(ends[8]>=biggest17504){
      biggest17504=ends[8];
    }
    if(ends[9]>=biggest17504){
      biggest17504=ends[9];
    }
    if(ends[10]>=biggest17504){
      biggest17504=ends[10];
    }
    if(ends[11]>=biggest17504){
      biggest17504=ends[11];
    }
    if(ends[12]>=biggest17504){
      biggest17504=ends[12];
    }
    if(ends[13]>=biggest17504){
      biggest17504=ends[13];
    }
    if(ends[14]>=biggest17504){
      biggest17504=ends[14];
    }
    if(biggest17504 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread17494(int [] tdone, int [] ends){
        S17120=1;
    S17069=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 57, column: 20
      S17069=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      dosUnitFilled.setPresent();//sysj\plantPOS.sysj line: 58, column: 5
      currsigs.addElement(dosUnitFilled);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread17493(int [] tdone, int [] ends){
        S17061=1;
    S17010=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 44, column: 21
      S17010=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      inletOff.setPresent();//sysj\plantPOS.sysj line: 45, column: 5
      currsigs.addElement(inletOff);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread17492(int [] tdone, int [] ends){
        S17002=1;
    S16951=0;
    if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 31, column: 21
      S16951=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      bottleAtPos2.setPresent();//sysj\plantPOS.sysj line: 32, column: 5
      currsigs.addElement(bottleAtPos2);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread17491(int [] tdone, int [] ends){
        S16943=1;
    S16892=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 18, column: 21
      S16892=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      injectorOff.setPresent();//sysj\plantPOS.sysj line: 19, column: 5
      currsigs.addElement(injectorOff);
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
      switch(S17489){
        case 0 : 
          S17489=0;
          break RUN;
        
        case 1 : 
          S17489=2;
          S17489=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantPOS.sysj line: 8, column: 1
            public void run() {//sysj\plantPOS.sysj line: 10, column: 21
              org.compsys704.Filler.main(null);//sysj\plantPOS.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantPOS.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantPOS.sysj line: 14, column: 2
          thread17491(tdone,ends);
          thread17492(tdone,ends);
          thread17493(tdone,ends);
          thread17494(tdone,ends);
          thread17495(tdone,ends);
          int biggest17505 = 0;
          if(ends[2]>=biggest17505){
            biggest17505=ends[2];
          }
          if(ends[3]>=biggest17505){
            biggest17505=ends[3];
          }
          if(ends[4]>=biggest17505){
            biggest17505=ends[4];
          }
          if(ends[5]>=biggest17505){
            biggest17505=ends[5];
          }
          if(ends[6]>=biggest17505){
            biggest17505=ends[6];
          }
          if(biggest17505 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread17506(tdone,ends);
          thread17507(tdone,ends);
          thread17508(tdone,ends);
          thread17509(tdone,ends);
          thread17510(tdone,ends);
          int biggest17520 = 0;
          if(ends[2]>=biggest17520){
            biggest17520=ends[2];
          }
          if(ends[3]>=biggest17520){
            biggest17520=ends[3];
          }
          if(ends[4]>=biggest17520){
            biggest17520=ends[4];
          }
          if(ends[5]>=biggest17520){
            biggest17520=ends[5];
          }
          if(ends[6]>=biggest17520){
            biggest17520=ends[6];
          }
          if(biggest17520 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest17520 == 0){
            S17489=0;
            active[1]=0;
            ends[1]=0;
            S17489=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
          jobDone.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      jobDone.setpreclear();
      enable.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      injectorOn.setpreclear();
      injectorOff.setpreclear();
      inletOn.setpreclear();
      inletOff.setpreclear();
      jobDoneN.setpreclear();
      bottleAtPos2E.setpreclear();
      dosUnitEvacE.setpreclear();
      dosUnitFilledE.setpreclear();
      injectorOnE.setpreclear();
      injectorOffE.setpreclear();
      inletOnE.setpreclear();
      inletOffE.setpreclear();
      jobDoneE.setpreclear();
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
      dummyint = jobDone.getStatus() ? jobDone.setprepresent() : jobDone.setpreclear();
      jobDone.setpreval(jobDone.getValue());
      jobDone.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      injectorOff.sethook();
      injectorOff.setClear();
      inletOn.sethook();
      inletOn.setClear();
      inletOff.sethook();
      inletOff.setClear();
      jobDoneN.sethook();
      jobDoneN.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      injectorOnE.sethook();
      injectorOnE.setClear();
      injectorOffE.sethook();
      injectorOffE.setClear();
      inletOnE.sethook();
      inletOnE.setClear();
      inletOffE.sethook();
      inletOffE.setClear();
      jobDoneE.sethook();
      jobDoneE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        jobDone.gethook();
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
