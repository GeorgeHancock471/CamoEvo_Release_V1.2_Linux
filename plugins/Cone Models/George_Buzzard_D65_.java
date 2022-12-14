// Code automatically generated by 'Generate Cone Mapping Model' script by Jolyon Troscianko

//Model fits:
//lw 0.9955988647652702
//mw 0.9965080503325887
//sw 0.995588939324791
//vs 0.9929058499282406
//dbl 0.9964198331716212


// Generated: 2021/10/10   14:5:16


import ij.*;
import ij.plugin.filter.PlugInFilter;
import ij.process.*;

public class George_Buzzard_D65_ implements PlugInFilter {

ImageStack stack;
	public int setup(String arg, ImagePlus imp) { 
	stack = imp.getStack(); 
	return DOES_32 + STACK_REQUIRED; 
	}
public void run(ImageProcessor ip) {

IJ.showStatus("Cone Mapping");
float[] visibleR;
float[] visibleG;
float[] visibleB;
float[] uvB;
float[] uvR;
int w = stack.getWidth();
int h = stack.getHeight();
int dimension = w*h;

float[] lw = new float[dimension];
float[] mw = new float[dimension];
float[] sw = new float[dimension];
float[] vs = new float[dimension];
float[] dbl = new float[dimension];

visibleR = (float[]) stack.getPixels(1);
visibleG = (float[]) stack.getPixels(2);
visibleB = (float[]) stack.getPixels(3);
uvB = (float[]) stack.getPixels(4);
uvR = (float[]) stack.getPixels(5);

for (int i=0;i<dimension;i++) {
lw[i] = (float) (-0.012509464480074277 +(visibleR[i]*0.011158298050943352)+(visibleG[i]*7.358346046030863E-4)+(visibleB[i]*3.170967838888892E-4)+(uvB[i]*-0.00856071129388487)+(uvR[i]*0.0059845922504561)+(visibleR[i]*visibleG[i]*1.5227327093433172E-5)+(visibleR[i]*visibleB[i]*1.5636054982469858E-5)+(visibleR[i]*uvB[i]*4.947970189545549E-5)+(visibleR[i]*uvR[i]*-6.916557311460237E-5)+(visibleG[i]*visibleB[i]*-7.948754003595041E-5)+(visibleG[i]*uvB[i]*2.5254195694964014E-4)+(visibleG[i]*uvR[i]*-2.0282285678828826E-4)+(visibleB[i]*uvB[i]*-1.668149818382041E-5)+(visibleB[i]*uvR[i]*2.7904769790379344E-5)+(uvB[i]*uvR[i]*1.607931747808235E-5));
mw[i] = (float) (-0.01010045114840758 +(visibleR[i]*-0.002275857606606228)+(visibleG[i]*0.017517817595952855)+(visibleB[i]*-0.005876026793151106)+(uvB[i]*8.55693643291752E-4)+(uvR[i]*3.218653538000555E-4)+(visibleR[i]*visibleG[i]*-2.9607221899280004E-7)+(visibleR[i]*visibleB[i]*-5.932480814080601E-6)+(visibleR[i]*uvB[i]*1.9001969069774494E-4)+(visibleR[i]*uvR[i]*-1.8215553264032993E-4)+(visibleG[i]*visibleB[i]*1.810610648937944E-5)+(visibleG[i]*uvB[i]*-4.36437155754978E-4)+(visibleG[i]*uvR[i]*3.841695972252291E-4)+(visibleB[i]*uvB[i]*1.289444473417879E-4)+(visibleB[i]*uvR[i]*-7.286156647417482E-5)+(uvB[i]*uvR[i]*-3.020146218343687E-5));
sw[i] = (float) (-0.002733773870937571 +(visibleR[i]*-7.539702644700716E-4)+(visibleG[i]*0.004341908956900372)+(visibleB[i]*0.007559516307512407)+(uvB[i]*0.004450239962670132)+(uvR[i]*-0.0063075260419360995)+(visibleR[i]*visibleG[i]*-1.8056720485045887E-6)+(visibleR[i]*visibleB[i]*-5.912044930435759E-5)+(visibleR[i]*uvB[i]*-5.189892060778168E-5)+(visibleR[i]*uvR[i]*1.12696865227378E-4)+(visibleG[i]*visibleB[i]*6.76500657648315E-5)+(visibleG[i]*uvB[i]*2.029341011171946E-4)+(visibleG[i]*uvR[i]*-3.0684598515845897E-4)+(visibleB[i]*uvB[i]*-4.393593748710829E-4)+(visibleB[i]*uvR[i]*5.137440808139261E-4)+(uvB[i]*uvR[i]*-1.2810271464540542E-5));
vs[i] = (float) (-0.011678904871425547 +(visibleR[i]*6.617933823886061E-4)+(visibleG[i]*-0.0030928299680966645)+(visibleB[i]*0.010151090133751034)+(uvB[i]*0.004682465771810352)+(uvR[i]*-0.0020201796737506312)+(visibleR[i]*visibleG[i]*-5.479118290507905E-6)+(visibleR[i]*visibleB[i]*5.807049756502202E-5)+(visibleR[i]*uvB[i]*5.464790149617316E-5)+(visibleR[i]*uvR[i]*-1.0891720083428189E-4)+(visibleG[i]*visibleB[i]*-3.22325605080774E-5)+(visibleG[i]*uvB[i]*-3.5461504847189655E-4)+(visibleG[i]*uvR[i]*3.9860461633466494E-4)+(visibleB[i]*uvB[i]*2.390759350570779E-4)+(visibleB[i]*uvR[i]*-2.8823403930735745E-4)+(uvB[i]*uvR[i]*4.374996557663309E-5));
dbl[i] = (float) (-0.011417174097114196 +(visibleR[i]*0.0018652711568049119)+(visibleG[i]*0.011217034104126632)+(visibleB[i]*-0.0020968881009000204)+(uvB[i]*-0.002032780163457461)+(uvR[i]*0.001007975802792934)+(visibleR[i]*visibleG[i]*3.606027803333266E-6)+(visibleR[i]*visibleB[i]*1.0323955298753022E-5)+(visibleR[i]*uvB[i]*5.372955769119412E-5)+(visibleR[i]*uvR[i]*-6.378184286130238E-5)+(visibleG[i]*visibleB[i]*-2.797245207707021E-5)+(visibleG[i]*uvB[i]*-1.1971883081276799E-5)+(visibleG[i]*uvR[i]*8.882579580484924E-6)+(visibleB[i]*uvB[i]*-1.8487347302770172E-5)+(visibleB[i]*uvR[i]*4.7986578543871845E-5)+(uvB[i]*uvR[i]*2.548514862871084E-6));
IJ.showProgress((float) i/dimension);
}

ImageStack outStack = new ImageStack(w, h);
outStack.addSlice("lw", lw);
outStack.addSlice("mw", mw);
outStack.addSlice("sw", sw);
outStack.addSlice("vs", vs);
outStack.addSlice("dbl", dbl);
new ImagePlus("Output", outStack).show();

}
}