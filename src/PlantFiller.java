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
  public Signal jobDone = new Signal("jobDone", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal enableFiller = new Signal("enableFiller", Signal.INPUT);
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
  private int S14967 = 1;
  private int S14279 = 1;
  private int S14228 = 1;
  private int S14344 = 1;
  private int S14297 = 1;
  private int S14409 = 1;
  private int S14346 = 1;
  private int S14468 = 1;
  private int S14417 = 1;
  private int S14527 = 1;
  private int S14476 = 1;
  private int S14593 = 1;
  private int S14535 = 1;
  private int S14529 = 1;
  private int S14543 = 1;
  private int S14551 = 1;
  private int S14559 = 1;
  private int S14567 = 1;
  private int S14575 = 1;
  private int S14583 = 1;
  private int S14591 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread14998(int [] tdone, int [] ends){
        switch(S14591){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 94, column: 24
          jobDoneE.setPresent();//sysj\plantFiller.sysj line: 94, column: 34
          currsigs.addElement(jobDoneE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread14997(int [] tdone, int [] ends){
        switch(S14583){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 92, column: 24
          inletOffE.setPresent();//sysj\plantFiller.sysj line: 92, column: 34
          currsigs.addElement(inletOffE);
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

  public void thread14996(int [] tdone, int [] ends){
        switch(S14575){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 90, column: 24
          inletOnE.setPresent();//sysj\plantFiller.sysj line: 90, column: 33
          currsigs.addElement(inletOnE);
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

  public void thread14995(int [] tdone, int [] ends){
        switch(S14567){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 88, column: 24
          injectorOffE.setPresent();//sysj\plantFiller.sysj line: 88, column: 37
          currsigs.addElement(injectorOffE);
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

  public void thread14994(int [] tdone, int [] ends){
        switch(S14559){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 86, column: 24
          injectorOnE.setPresent();//sysj\plantFiller.sysj line: 86, column: 36
          currsigs.addElement(injectorOnE);
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

  public void thread14993(int [] tdone, int [] ends){
        switch(S14551){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 84, column: 24
          dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 84, column: 39
          currsigs.addElement(dosUnitFilledE);
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

  public void thread14992(int [] tdone, int [] ends){
        switch(S14543){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 82, column: 24
          dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 82, column: 37
          currsigs.addElement(dosUnitEvacE);
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

  public void thread14991(int [] tdone, int [] ends){
        switch(S14535){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S14529){
          case 0 : 
            S14529=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 80, column: 38
              currsigs.addElement(bottleAtPos2E);
              S14529=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S14529=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S14529=1;
            S14529=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 80, column: 38
              currsigs.addElement(bottleAtPos2E);
              S14529=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S14529=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread14990(int [] tdone, int [] ends){
        switch(S14593){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread14991(tdone,ends);
        thread14992(tdone,ends);
        thread14993(tdone,ends);
        thread14994(tdone,ends);
        thread14995(tdone,ends);
        thread14996(tdone,ends);
        thread14997(tdone,ends);
        thread14998(tdone,ends);
        int biggest14999 = 0;
        if(ends[8]>=biggest14999){
          biggest14999=ends[8];
        }
        if(ends[9]>=biggest14999){
          biggest14999=ends[9];
        }
        if(ends[10]>=biggest14999){
          biggest14999=ends[10];
        }
        if(ends[11]>=biggest14999){
          biggest14999=ends[11];
        }
        if(ends[12]>=biggest14999){
          biggest14999=ends[12];
        }
        if(ends[13]>=biggest14999){
          biggest14999=ends[13];
        }
        if(ends[14]>=biggest14999){
          biggest14999=ends[14];
        }
        if(ends[15]>=biggest14999){
          biggest14999=ends[15];
        }
        if(biggest14999 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest14999 == 0){
          S14593=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread14989(int [] tdone, int [] ends){
        switch(S14527){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S14476){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 68, column: 20
              S14476=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 69, column: 5
              currsigs.addElement(dosUnitFilled);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 71, column: 10
              S14476=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 72, column: 20
                S14476=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 73, column: 5
                currsigs.addElement(dosUnitEvac);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 72, column: 20
              S14476=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 73, column: 5
              currsigs.addElement(dosUnitEvac);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 75, column: 10
              S14476=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 68, column: 20
                S14476=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 69, column: 5
                currsigs.addElement(dosUnitFilled);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread14988(int [] tdone, int [] ends){
        switch(S14468){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S14417){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 55, column: 21
              S14417=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              inletOff.setPresent();//sysj\plantFiller.sysj line: 56, column: 5
              currsigs.addElement(inletOff);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 58, column: 10
              S14417=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 59, column: 20
                S14417=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                inletOn.setPresent();//sysj\plantFiller.sysj line: 60, column: 5
                currsigs.addElement(inletOn);
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
            if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 59, column: 20
              S14417=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              inletOn.setPresent();//sysj\plantFiller.sysj line: 60, column: 5
              currsigs.addElement(inletOn);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 62, column: 10
              S14417=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 55, column: 21
                S14417=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                inletOff.setPresent();//sysj\plantFiller.sysj line: 56, column: 5
                currsigs.addElement(inletOff);
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

  public void thread14987(int [] tdone, int [] ends){
        switch(S14409){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S14346){
          case 0 : 
            if(jobDone.getprestatus()){//sysj\plantFiller.sysj line: 43, column: 10
              System.out.println("jobDone2");//sysj\plantFiller.sysj line: 44, column: 4
              S14346=1;
              if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 45, column: 21
                S14346=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("jobDone3");//sysj\plantFiller.sysj line: 46, column: 5
                jobDoneN.setPresent();//sysj\plantFiller.sysj line: 47, column: 6
                currsigs.addElement(jobDoneN);
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
            if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 45, column: 21
              S14346=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              jobDoneN.setPresent();//sysj\plantFiller.sysj line: 47, column: 6
              currsigs.addElement(jobDoneN);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 49, column: 9
              S14346=0;
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
        break;
      
    }
  }

  public void thread14986(int [] tdone, int [] ends){
        switch(S14344){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S14297){
          case 0 : 
            if(enableFiller.getprestatus()){//sysj\plantFiller.sysj line: 32, column: 11
              S14297=1;
              if((!enableFiller.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
                S14297=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                System.out.println("enableFiller");//sysj\plantFiller.sysj line: 34, column: 5
                bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
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
          
          case 1 : 
            if((!enableFiller.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
              S14297=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
              currsigs.addElement(bottleAtPos2);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 37, column: 9
              S14297=0;
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
          
        }
        break;
      
    }
  }

  public void thread14985(int [] tdone, int [] ends){
        switch(S14279){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S14228){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
              S14228=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
              currsigs.addElement(injectorOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 22, column: 10
              S14228=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 23, column: 20
                S14228=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOn.setPresent();//sysj\plantFiller.sysj line: 24, column: 5
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
            if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 23, column: 20
              S14228=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOn.setPresent();//sysj\plantFiller.sysj line: 24, column: 5
              currsigs.addElement(injectorOn);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 26, column: 10
              S14228=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
                S14228=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
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

  public void thread14982(int [] tdone, int [] ends){
        S14591=1;
    if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 94, column: 24
      jobDoneE.setPresent();//sysj\plantFiller.sysj line: 94, column: 34
      currsigs.addElement(jobDoneE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread14981(int [] tdone, int [] ends){
        S14583=1;
    if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 92, column: 24
      inletOffE.setPresent();//sysj\plantFiller.sysj line: 92, column: 34
      currsigs.addElement(inletOffE);
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

  public void thread14980(int [] tdone, int [] ends){
        S14575=1;
    if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 90, column: 24
      inletOnE.setPresent();//sysj\plantFiller.sysj line: 90, column: 33
      currsigs.addElement(inletOnE);
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

  public void thread14979(int [] tdone, int [] ends){
        S14567=1;
    if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 88, column: 24
      injectorOffE.setPresent();//sysj\plantFiller.sysj line: 88, column: 37
      currsigs.addElement(injectorOffE);
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

  public void thread14978(int [] tdone, int [] ends){
        S14559=1;
    if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 86, column: 24
      injectorOnE.setPresent();//sysj\plantFiller.sysj line: 86, column: 36
      currsigs.addElement(injectorOnE);
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

  public void thread14977(int [] tdone, int [] ends){
        S14551=1;
    if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 84, column: 24
      dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 84, column: 39
      currsigs.addElement(dosUnitFilledE);
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

  public void thread14976(int [] tdone, int [] ends){
        S14543=1;
    if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 82, column: 24
      dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 82, column: 37
      currsigs.addElement(dosUnitEvacE);
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

  public void thread14975(int [] tdone, int [] ends){
        S14535=1;
    S14529=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
      bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 80, column: 38
      currsigs.addElement(bottleAtPos2E);
      S14529=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S14529=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread14974(int [] tdone, int [] ends){
        S14593=1;
    thread14975(tdone,ends);
    thread14976(tdone,ends);
    thread14977(tdone,ends);
    thread14978(tdone,ends);
    thread14979(tdone,ends);
    thread14980(tdone,ends);
    thread14981(tdone,ends);
    thread14982(tdone,ends);
    int biggest14983 = 0;
    if(ends[8]>=biggest14983){
      biggest14983=ends[8];
    }
    if(ends[9]>=biggest14983){
      biggest14983=ends[9];
    }
    if(ends[10]>=biggest14983){
      biggest14983=ends[10];
    }
    if(ends[11]>=biggest14983){
      biggest14983=ends[11];
    }
    if(ends[12]>=biggest14983){
      biggest14983=ends[12];
    }
    if(ends[13]>=biggest14983){
      biggest14983=ends[13];
    }
    if(ends[14]>=biggest14983){
      biggest14983=ends[14];
    }
    if(ends[15]>=biggest14983){
      biggest14983=ends[15];
    }
    if(biggest14983 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread14973(int [] tdone, int [] ends){
        S14527=1;
    S14476=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 68, column: 20
      S14476=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 69, column: 5
      currsigs.addElement(dosUnitFilled);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread14972(int [] tdone, int [] ends){
        S14468=1;
    S14417=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 55, column: 21
      S14417=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      inletOff.setPresent();//sysj\plantFiller.sysj line: 56, column: 5
      currsigs.addElement(inletOff);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread14971(int [] tdone, int [] ends){
        S14409=1;
    S14346=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread14970(int [] tdone, int [] ends){
        S14344=1;
    S14297=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread14969(int [] tdone, int [] ends){
        S14279=1;
    S14228=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
      S14228=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
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
      switch(S14967){
        case 0 : 
          S14967=0;
          break RUN;
        
        case 1 : 
          S14967=2;
          S14967=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantFiller.sysj line: 9, column: 1
            public void run() {//sysj\plantFiller.sysj line: 11, column: 21
              org.compsys704.Filler.main(null);//sysj\plantFiller.sysj line: 12, column: 4
            }
            GUI(){//sysj\plantFiller.sysj line: 10, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantFiller.sysj line: 15, column: 2
          thread14969(tdone,ends);
          thread14970(tdone,ends);
          thread14971(tdone,ends);
          thread14972(tdone,ends);
          thread14973(tdone,ends);
          thread14974(tdone,ends);
          int biggest14984 = 0;
          if(ends[2]>=biggest14984){
            biggest14984=ends[2];
          }
          if(ends[3]>=biggest14984){
            biggest14984=ends[3];
          }
          if(ends[4]>=biggest14984){
            biggest14984=ends[4];
          }
          if(ends[5]>=biggest14984){
            biggest14984=ends[5];
          }
          if(ends[6]>=biggest14984){
            biggest14984=ends[6];
          }
          if(ends[7]>=biggest14984){
            biggest14984=ends[7];
          }
          if(biggest14984 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread14985(tdone,ends);
          thread14986(tdone,ends);
          thread14987(tdone,ends);
          thread14988(tdone,ends);
          thread14989(tdone,ends);
          thread14990(tdone,ends);
          int biggest15000 = 0;
          if(ends[2]>=biggest15000){
            biggest15000=ends[2];
          }
          if(ends[3]>=biggest15000){
            biggest15000=ends[3];
          }
          if(ends[4]>=biggest15000){
            biggest15000=ends[4];
          }
          if(ends[5]>=biggest15000){
            biggest15000=ends[5];
          }
          if(ends[6]>=biggest15000){
            biggest15000=ends[6];
          }
          if(ends[7]>=biggest15000){
            biggest15000=ends[7];
          }
          if(biggest15000 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest15000 == 0){
            S14967=0;
            active[1]=0;
            ends[1]=0;
            S14967=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          enableFiller.gethook();
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
      enableFiller.setpreclear();
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
      dummyint = enableFiller.getStatus() ? enableFiller.setprepresent() : enableFiller.setpreclear();
      enableFiller.setpreval(enableFiller.getValue());
      enableFiller.setClear();
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
        enableFiller.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
