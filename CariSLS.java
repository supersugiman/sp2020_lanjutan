package io.kodular.supersugiman.SIMPELSP2020LANJUTAN;

import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Decoration;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.File;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListView;
import com.google.appinventor.components.runtime.MakeroidFab;
import com.google.appinventor.components.runtime.MakeroidViewPager;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import org.jose4j.jws.AlgorithmIdentifiers;
/* compiled from: CariSLS.yail */
/* loaded from: classes.dex */
public class CariSLS extends Form implements Runnable {
    public static CariSLS CariSLS;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final PairWithPosition Lit10;
    static final IntNum Lit100;
    static final SimpleSymbol Lit101;
    static final IntNum Lit102;
    static final SimpleSymbol Lit103;
    static final IntNum Lit104;
    static final SimpleSymbol Lit105;
    static final IntNum Lit106;
    static final FString Lit107;
    static final FString Lit108;
    static final SimpleSymbol Lit109;
    static final IntNum Lit11;
    static final IntNum Lit110;
    static final FString Lit111;
    static final FString Lit112;
    static final SimpleSymbol Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final SimpleSymbol Lit116;
    static final IntNum Lit117;
    static final IntNum Lit118;
    static final FString Lit119;
    static final PairWithPosition Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final IntNum Lit122;
    static final IntNum Lit123;
    static final FString Lit124;
    static final FString Lit125;
    static final SimpleSymbol Lit126;
    static final SimpleSymbol Lit127;
    static final IntNum Lit128;
    static final SimpleSymbol Lit129;
    static final PairWithPosition Lit13;
    static final FString Lit130;
    static final PairWithPosition Lit131;
    static final SimpleSymbol Lit132;
    static final SimpleSymbol Lit133;
    static final PairWithPosition Lit134;
    static final SimpleSymbol Lit135;
    static final PairWithPosition Lit136;
    static final SimpleSymbol Lit137;
    static final SimpleSymbol Lit138;
    static final FString Lit139;
    static final PairWithPosition Lit14;
    static final SimpleSymbol Lit140;
    static final IntNum Lit141;
    static final FString Lit142;
    static final FString Lit143;
    static final SimpleSymbol Lit144;
    static final IntNum Lit145;
    static final FString Lit146;
    static final FString Lit147;
    static final SimpleSymbol Lit148;
    static final IntNum Lit149;
    static final SimpleSymbol Lit15;
    static final FString Lit150;
    static final FString Lit151;
    static final SimpleSymbol Lit152;
    static final IntNum Lit153;
    static final FString Lit154;
    static final FString Lit155;
    static final SimpleSymbol Lit156;
    static final IntNum Lit157;
    static final FString Lit158;
    static final FString Lit159;
    static final SimpleSymbol Lit16;
    static final SimpleSymbol Lit160;
    static final IntNum Lit161;
    static final FString Lit162;
    static final FString Lit163;
    static final SimpleSymbol Lit164;
    static final IntNum Lit165;
    static final FString Lit166;
    static final FString Lit167;
    static final SimpleSymbol Lit168;
    static final IntNum Lit169;
    static final SimpleSymbol Lit17;
    static final FString Lit170;
    static final FString Lit171;
    static final SimpleSymbol Lit172;
    static final IntNum Lit173;
    static final SimpleSymbol Lit174;
    static final IntNum Lit175;
    static final SimpleSymbol Lit176;
    static final IntNum Lit177;
    static final SimpleSymbol Lit178;
    static final SimpleSymbol Lit179;
    static final SimpleSymbol Lit18;
    static final IntNum Lit180;
    static final SimpleSymbol Lit181;
    static final IntNum Lit182;
    static final SimpleSymbol Lit183;
    static final IntNum Lit184;
    static final SimpleSymbol Lit185;
    static final IntNum Lit186;
    static final SimpleSymbol Lit187;
    static final SimpleSymbol Lit188;
    static final SimpleSymbol Lit189;
    static final SimpleSymbol Lit19;
    static final FString Lit190;
    static final SimpleSymbol Lit191;
    static final PairWithPosition Lit192;
    static final SimpleSymbol Lit193;
    static final PairWithPosition Lit194;
    static final PairWithPosition Lit195;
    static final SimpleSymbol Lit196;
    static final SimpleSymbol Lit197;
    static final FString Lit198;
    static final SimpleSymbol Lit199;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20;
    static final IntNum Lit200;
    static final FString Lit201;
    static final FString Lit202;
    static final FString Lit203;
    static final FString Lit204;
    static final SimpleSymbol Lit205;
    static final IntNum Lit206;
    static final IntNum Lit207;
    static final FString Lit208;
    static final FString Lit209;
    static final PairWithPosition Lit21;
    static final SimpleSymbol Lit210;
    static final IntNum Lit211;
    static final FString Lit212;
    static final FString Lit213;
    static final IntNum Lit214;
    static final IntNum Lit215;
    static final IntNum Lit216;
    static final SimpleSymbol Lit217;
    static final IntNum Lit218;
    static final FString Lit219;
    static final PairWithPosition Lit22;
    static final PairWithPosition Lit220;
    static final PairWithPosition Lit221;
    static final PairWithPosition Lit222;
    static final SimpleSymbol Lit223;
    static final PairWithPosition Lit224;
    static final SimpleSymbol Lit225;
    static final SimpleSymbol Lit226;
    static final FString Lit227;
    static final FString Lit228;
    static final FString Lit229;
    static final PairWithPosition Lit23;
    static final SimpleSymbol Lit230;
    static final FString Lit231;
    static final FString Lit232;
    static final FString Lit233;
    static final SimpleSymbol Lit234;
    static final PairWithPosition Lit235;
    static final SimpleSymbol Lit236;
    static final PairWithPosition Lit237;
    static final PairWithPosition Lit238;
    static final PairWithPosition Lit239;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit240;
    static final SimpleSymbol Lit241;
    static final FString Lit242;
    static final SimpleSymbol Lit243;
    static final IntNum Lit244;
    static final SimpleSymbol Lit245;
    static final SimpleSymbol Lit246;
    static final FString Lit247;
    static final PairWithPosition Lit248;
    static final SimpleSymbol Lit249;
    static final IntNum Lit25;
    static final FString Lit250;
    static final SimpleSymbol Lit251;
    static final FString Lit252;
    static final FString Lit253;
    static final SimpleSymbol Lit254;
    static final IntNum Lit255;
    static final SimpleSymbol Lit256;
    static final IntNum Lit257;
    static final FString Lit258;
    static final SimpleSymbol Lit259;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit260;
    static final FString Lit261;
    static final FString Lit262;
    static final PairWithPosition Lit263;
    static final SimpleSymbol Lit264;
    static final PairWithPosition Lit265;
    static final SimpleSymbol Lit266;
    static final FString Lit267;
    static final SimpleSymbol Lit268;
    static final FString Lit269;
    static final SimpleSymbol Lit27;
    static final FString Lit270;
    static final FString Lit271;
    static final SimpleSymbol Lit272;
    static final PairWithPosition Lit273;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final IntNum Lit31;
    static final SimpleSymbol Lit32;
    static final IntNum Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40;
    static final PairWithPosition Lit41;
    static final SimpleSymbol Lit42;
    static final SimpleSymbol Lit43;
    static final SimpleSymbol Lit44;
    static final IntNum Lit45;
    static final IntNum Lit46;
    static final PairWithPosition Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final PairWithPosition Lit51;
    static final SimpleSymbol Lit52;
    static final PairWithPosition Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final FString Lit56;
    static final SimpleSymbol Lit57;
    static final IntNum Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final PairWithPosition Lit61;
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit63;
    static final SimpleSymbol Lit64;
    static final FString Lit65;
    static final SimpleSymbol Lit66;
    static final SimpleSymbol Lit67;
    static final IntNum Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70;
    static final SimpleSymbol Lit71;
    static final IntNum Lit72;
    static final FString Lit73;
    static final FString Lit74;
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77;
    static final IntNum Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final IntNum Lit82;
    static final FString Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final IntNum Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final IntNum Lit90;
    static final FString Lit91;
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final IntNum Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final FString Lit98;
    static final FString Lit99;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button ButtonSimpan;
    public final ModuleMethod ButtonSimpan$Click;
    public final ModuleMethod CariSLS$Initialize;
    public Decoration Decoration1;
    public File File1;
    public final ModuleMethod File1$GotText;
    public MakeroidFab Floating_Action_Button1;
    public final ModuleMethod Floating_Action_Button1$Click;
    public MakeroidFab Floating_Action_Refresh;
    public final ModuleMethod Floating_Action_Refresh$Click;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public Label Label5;
    public Label Label6;
    public Label Label6_copy;
    public Label Label6_copy_copy;
    public Label Label6_copy_copy_copy;
    public Label Label6_copy_copy_copy_copy;
    public Label Label6_copy_copy_copy_copy_copy;
    public Label Label6_copy_copy_copy_copy_copy1;
    public Label Label6_copy_copy_copy_copy_copy1_copy;
    public Label Label6_copy_copy_copy_copy_copy_copy;
    public ListView List_View1;
    public final ModuleMethod List_View1$LongClick;
    public ListView List_View2;
    public final ModuleMethod List_View2$AfterPicking;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public Notifier Notifier2;
    public final ModuleMethod Notifier2$AfterChoosing;
    public Notifier Notifier3;
    public SpaceView Space1;
    public SpaceView Space1_copy;
    public SpaceView Space1_copy1;
    public SpaceView Space1_copy2;
    public SpaceView Space1_copy2_copy;
    public SpaceView Space1_copy2_copy_copy1;
    public SpaceView Space1_copy2_copy_copy1_copy;
    public SpaceView Space1_copy2_copy_copy_copy;
    public SpaceView Space2_copy;
    public TextBox Text_BoxIDNKS;
    public TinyDB Tiny_DB10;
    public VerticalScrollArrangement Vertical_Scroll_Arrangement1;
    public VerticalScrollArrangement Vertical_Scroll_Arrangement2;
    public MakeroidViewPager View_Pager1;
    public final ModuleMethod View_Pager1$PageSelected;
    public Web Web1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    static final SimpleSymbol Lit291 = (SimpleSymbol) new SimpleSymbol("component").readResolve();
    static final SimpleSymbol Lit290 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit289 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit288 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit287 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit286 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit285 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit284 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit283 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit282 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit281 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit280 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit279 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit278 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit277 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit276 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final SimpleSymbol Lit275 = (SimpleSymbol) new SimpleSymbol("GotText").readResolve();
    static final SimpleSymbol Lit274 = (SimpleSymbol) new SimpleSymbol("File1$GotText").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit28 = simpleSymbol;
        Lit273 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1933454);
        Lit272 = (SimpleSymbol) new SimpleSymbol("$text").readResolve();
        Lit271 = new FString("com.google.appinventor.components.runtime.File");
        Lit270 = new FString("com.google.appinventor.components.runtime.File");
        Lit269 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit268 = (SimpleSymbol) new SimpleSymbol("Notifier3").readResolve();
        Lit267 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit266 = (SimpleSymbol) new SimpleSymbol("Notifier2$AfterChoosing").readResolve();
        Lit265 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1884363);
        Lit264 = (SimpleSymbol) new SimpleSymbol("ClearTag").readResolve();
        Lit263 = PairWithPosition.make(Lit290, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1884262), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1884257);
        Lit262 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit261 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit260 = (SimpleSymbol) new SimpleSymbol("Floating_Action_Refresh$Click").readResolve();
        Lit259 = (SimpleSymbol) new SimpleSymbol("HideKeyboard").readResolve();
        Lit258 = new FString("com.google.appinventor.components.runtime.MakeroidFab");
        Lit257 = IntNum.make(80);
        Lit256 = (SimpleSymbol) new SimpleSymbol("MarginBottom").readResolve();
        Lit255 = IntNum.make(new int[]{Component.COLOR_TEAL});
        Lit254 = (SimpleSymbol) new SimpleSymbol("Floating_Action_Refresh").readResolve();
        Lit253 = new FString("com.google.appinventor.components.runtime.MakeroidFab");
        Lit252 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit251 = (SimpleSymbol) new SimpleSymbol("Namespace").readResolve();
        Lit250 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit249 = (SimpleSymbol) new SimpleSymbol("Floating_Action_Button1$Click").readResolve();
        Lit248 = PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1773650);
        Lit247 = new FString("com.google.appinventor.components.runtime.MakeroidFab");
        Lit246 = (SimpleSymbol) new SimpleSymbol("IconName").readResolve();
        Lit245 = (SimpleSymbol) new SimpleSymbol("Icon").readResolve();
        Lit244 = IntNum.make(new int[]{-17093368});
        Lit243 = (SimpleSymbol) new SimpleSymbol("Floating_Action_Button1").readResolve();
        Lit242 = new FString("com.google.appinventor.components.runtime.MakeroidFab");
        Lit241 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
        Lit240 = (SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve();
        Lit239 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720801), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720796), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720790);
        Lit238 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720665), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720659);
        Lit237 = PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720635);
        Lit236 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit235 = PairWithPosition.make(Lit290, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720418), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1720413);
        Lit234 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
        Lit233 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit232 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit231 = new FString("com.google.appinventor.components.runtime.Web");
        Lit230 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
        Lit229 = new FString("com.google.appinventor.components.runtime.Web");
        Lit228 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit227 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit226 = (SimpleSymbol) new SimpleSymbol("LongClick").readResolve();
        Lit225 = (SimpleSymbol) new SimpleSymbol("List_View1$LongClick").readResolve();
        SimpleSymbol simpleSymbol2 = Lit28;
        SimpleSymbol simpleSymbol3 = Lit28;
        SimpleSymbol simpleSymbol4 = Lit28;
        SimpleSymbol simpleSymbol5 = Lit28;
        SimpleSymbol simpleSymbol6 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit36 = simpleSymbol6;
        Lit224 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651193), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651188), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651183), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651178), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651172);
        Lit223 = (SimpleSymbol) new SimpleSymbol("Notifier2").readResolve();
        Lit222 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651013), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651008), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1651002);
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit18 = simpleSymbol7;
        SimpleSymbol simpleSymbol8 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit26 = simpleSymbol8;
        Lit221 = PairWithPosition.make(simpleSymbol7, PairWithPosition.make(simpleSymbol8, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1650961), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1650955);
        Lit220 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1650936), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1650930);
        Lit219 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit218 = IntNum.make(new int[]{Component.COLOR_AMBER});
        Lit217 = (SimpleSymbol) new SimpleSymbol("LongClickEnabled").readResolve();
        Lit216 = IntNum.make(6);
        Lit215 = IntNum.make(10);
        Lit214 = IntNum.make(new int[]{-32885510});
        Lit213 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit212 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit211 = IntNum.make(-1003);
        Lit210 = (SimpleSymbol) new SimpleSymbol("Space2_copy").readResolve();
        Lit209 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit208 = new FString("com.google.appinventor.components.runtime.Label");
        Lit207 = IntNum.make(new int[]{-17625851});
        Lit206 = IntNum.make(16);
        Lit205 = (SimpleSymbol) new SimpleSymbol("Label5").readResolve();
        Lit204 = new FString("com.google.appinventor.components.runtime.Label");
        Lit203 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit202 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit201 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit200 = IntNum.make(-1001);
        Lit199 = (SimpleSymbol) new SimpleSymbol("Space1_copy2_copy").readResolve();
        Lit198 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit197 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit196 = (SimpleSymbol) new SimpleSymbol("List_View2$AfterPicking").readResolve();
        Lit195 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1376768), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1376763), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1376757);
        Lit194 = PairWithPosition.make(Lit18, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1376721), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1376715);
        Lit193 = (SimpleSymbol) new SimpleSymbol("$Tampung_List").readResolve();
        Lit192 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1376499), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 1376493);
        Lit191 = (SimpleSymbol) new SimpleSymbol("Selection").readResolve();
        Lit190 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit189 = (SimpleSymbol) new SimpleSymbol("TextSize").readResolve();
        Lit188 = (SimpleSymbol) new SimpleSymbol("ShowSelectionColor").readResolve();
        Lit187 = (SimpleSymbol) new SimpleSymbol("ShowFilterBar").readResolve();
        Lit186 = IntNum.make(new int[]{Component.COLOR_ORANGE});
        Lit185 = (SimpleSymbol) new SimpleSymbol("SelectionColor").readResolve();
        Lit184 = IntNum.make(29);
        Lit183 = (SimpleSymbol) new SimpleSymbol("SearchTextSize").readResolve();
        Lit182 = IntNum.make(new int[]{-17625851});
        Lit181 = (SimpleSymbol) new SimpleSymbol("SearchTextColor").readResolve();
        Lit180 = IntNum.make(7);
        Lit179 = (SimpleSymbol) new SimpleSymbol("ItemHeight").readResolve();
        Lit178 = (SimpleSymbol) new SimpleSymbol("FilterBarHint").readResolve();
        Lit177 = IntNum.make(8);
        Lit176 = (SimpleSymbol) new SimpleSymbol("DividerHeight").readResolve();
        Lit175 = IntNum.make(new int[]{-32885510});
        Lit174 = (SimpleSymbol) new SimpleSymbol("DividerColor").readResolve();
        Lit173 = IntNum.make(new int[]{Component.COLOR_GRAY});
        Lit172 = (SimpleSymbol) new SimpleSymbol("List_View2").readResolve();
        Lit171 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit170 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit169 = IntNum.make(-1003);
        Lit168 = (SimpleSymbol) new SimpleSymbol("Space1_copy2_copy_copy1_copy").readResolve();
        Lit167 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit166 = new FString("com.google.appinventor.components.runtime.Label");
        Lit165 = IntNum.make(new int[]{-17093368});
        Lit164 = (SimpleSymbol) new SimpleSymbol("Label6_copy_copy_copy_copy_copy1_copy").readResolve();
        Lit163 = new FString("com.google.appinventor.components.runtime.Label");
        Lit162 = new FString("com.google.appinventor.components.runtime.Label");
        Lit161 = IntNum.make(new int[]{-17093368});
        Lit160 = (SimpleSymbol) new SimpleSymbol("Label6_copy_copy_copy_copy_copy1").readResolve();
        Lit159 = new FString("com.google.appinventor.components.runtime.Label");
        Lit158 = new FString("com.google.appinventor.components.runtime.Label");
        Lit157 = IntNum.make(new int[]{-17093368});
        Lit156 = (SimpleSymbol) new SimpleSymbol("Label6_copy_copy_copy_copy_copy_copy").readResolve();
        Lit155 = new FString("com.google.appinventor.components.runtime.Label");
        Lit154 = new FString("com.google.appinventor.components.runtime.Label");
        Lit153 = IntNum.make(new int[]{-17093368});
        Lit152 = (SimpleSymbol) new SimpleSymbol("Label6_copy_copy_copy_copy_copy").readResolve();
        Lit151 = new FString("com.google.appinventor.components.runtime.Label");
        Lit150 = new FString("com.google.appinventor.components.runtime.Label");
        Lit149 = IntNum.make(new int[]{-17093368});
        Lit148 = (SimpleSymbol) new SimpleSymbol("Label6_copy_copy_copy_copy").readResolve();
        Lit147 = new FString("com.google.appinventor.components.runtime.Label");
        Lit146 = new FString("com.google.appinventor.components.runtime.Label");
        Lit145 = IntNum.make(new int[]{-17093368});
        Lit144 = (SimpleSymbol) new SimpleSymbol("Label6_copy_copy_copy").readResolve();
        Lit143 = new FString("com.google.appinventor.components.runtime.Label");
        Lit142 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit141 = IntNum.make(-1002);
        Lit140 = (SimpleSymbol) new SimpleSymbol("Space1_copy2_copy_copy1").readResolve();
        Lit139 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit138 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit137 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan$Click").readResolve();
        Lit136 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit36, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766371), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766366), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766361), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766356), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766350);
        Lit135 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit134 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766212), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766207), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766201);
        Lit133 = (SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve();
        Lit132 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit131 = PairWithPosition.make(Lit290, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766060), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 766055);
        Lit130 = new FString("com.google.appinventor.components.runtime.Button");
        Lit129 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit128 = IntNum.make(new int[]{-16294316});
        Lit127 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit126 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan").readResolve();
        Lit125 = new FString("com.google.appinventor.components.runtime.Button");
        Lit124 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit123 = IntNum.make(-1002);
        Lit122 = IntNum.make(-1003);
        Lit121 = (SimpleSymbol) new SimpleSymbol("Space1_copy2").readResolve();
        Lit120 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit119 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit118 = IntNum.make(-1002);
        Lit117 = IntNum.make(-1003);
        Lit116 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit115 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit114 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit113 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement3").readResolve();
        Lit112 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit111 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit110 = IntNum.make(-1001);
        Lit109 = (SimpleSymbol) new SimpleSymbol("Space1_copy2_copy_copy_copy").readResolve();
        Lit108 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit107 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit106 = IntNum.make(new int[]{-32885510});
        Lit105 = (SimpleSymbol) new SimpleSymbol("ReadOnly").readResolve();
        Lit104 = IntNum.make(5);
        Lit103 = (SimpleSymbol) new SimpleSymbol("InputType").readResolve();
        Lit102 = IntNum.make(new int[]{-32885510});
        Lit101 = (SimpleSymbol) new SimpleSymbol("HintColor").readResolve();
        Lit100 = IntNum.make(17);
        Lit99 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit98 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit97 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement2").readResolve();
        Lit96 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit95 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit94 = IntNum.make(-1001);
        Lit93 = (SimpleSymbol) new SimpleSymbol("Space1_copy1").readResolve();
        Lit92 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit91 = new FString("com.google.appinventor.components.runtime.Label");
        Lit90 = IntNum.make(new int[]{-17093368});
        Lit89 = (SimpleSymbol) new SimpleSymbol("Label6_copy_copy").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.Label");
        Lit87 = new FString("com.google.appinventor.components.runtime.Label");
        Lit86 = IntNum.make(new int[]{-17093368});
        Lit85 = (SimpleSymbol) new SimpleSymbol("Label6_copy").readResolve();
        Lit84 = new FString("com.google.appinventor.components.runtime.Label");
        Lit83 = new FString("com.google.appinventor.components.runtime.Label");
        Lit82 = IntNum.make(new int[]{-17093368});
        Lit81 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit80 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit79 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit78 = IntNum.make(15);
        Lit77 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit76 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit75 = (SimpleSymbol) new SimpleSymbol("Label6").readResolve();
        Lit74 = new FString("com.google.appinventor.components.runtime.Label");
        Lit73 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit72 = IntNum.make(-2);
        Lit71 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit69 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit68 = IntNum.make(-1003);
        Lit67 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit66 = (SimpleSymbol) new SimpleSymbol("Space1_copy").readResolve();
        Lit65 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit64 = (SimpleSymbol) new SimpleSymbol("PageSelected").readResolve();
        Lit63 = (SimpleSymbol) new SimpleSymbol("View_Pager1$PageSelected").readResolve();
        Lit62 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit61 = PairWithPosition.make(Lit290, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 139391), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 139386);
        Lit60 = (SimpleSymbol) new SimpleSymbol("GetCurrentPage").readResolve();
        Lit59 = new FString("com.google.appinventor.components.runtime.MakeroidViewPager");
        Lit58 = IntNum.make(new int[]{-33406152});
        Lit57 = (SimpleSymbol) new SimpleSymbol("TabsBackgroundColor").readResolve();
        Lit56 = new FString("com.google.appinventor.components.runtime.MakeroidViewPager");
        Lit55 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit54 = (SimpleSymbol) new SimpleSymbol("CariSLS$Initialize").readResolve();
        Lit53 = PairWithPosition.make(Lit291, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102953), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102942);
        Lit52 = (SimpleSymbol) new SimpleSymbol("Vertical_Scroll_Arrangement2").readResolve();
        Lit51 = PairWithPosition.make(Lit291, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102796), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102785);
        Lit50 = (SimpleSymbol) new SimpleSymbol("Vertical_Scroll_Arrangement1").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("AddComponentToView").readResolve();
        Lit48 = (SimpleSymbol) new SimpleSymbol("View_Pager1").readResolve();
        Lit47 = PairWithPosition.make(Lit291, PairWithPosition.make(Lit26, PairWithPosition.make(Lit26, PairWithPosition.make(Lit36, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102638), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102631), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102624), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102613);
        Lit46 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit45 = IntNum.make((int) Component.COLOR_LIGHT_GRAY);
        Lit44 = (SimpleSymbol) new SimpleSymbol("Text_BoxIDNKS").readResolve();
        Lit43 = (SimpleSymbol) new SimpleSymbol("SetShape").readResolve();
        Lit42 = (SimpleSymbol) new SimpleSymbol("Decoration1").readResolve();
        Lit41 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 102486);
        Lit40 = (SimpleSymbol) new SimpleSymbol("ReadFrom").readResolve();
        Lit39 = (SimpleSymbol) new SimpleSymbol("File1").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("TitleBarSubTitle").readResolve();
        Lit37 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit34 = (SimpleSymbol) new SimpleSymbol("ReceiveSharedText").readResolve();
        Lit33 = IntNum.make(new int[]{-33408463});
        Lit32 = (SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve();
        Lit31 = IntNum.make(new int[]{-16294316});
        Lit30 = (SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol("AppId").readResolve();
        Lit25 = IntNum.make(3);
        Lit24 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit23 = PairWithPosition.make(Lit18, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41487), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41481);
        Lit22 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41463), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41457);
        Lit21 = PairWithPosition.make(Lit18, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41426), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41420);
        Lit20 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41410), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41404);
        Lit19 = (SimpleSymbol) new SimpleSymbol("proc").readResolve();
        Lit17 = (SimpleSymbol) new SimpleSymbol("Elements").readResolve();
        Lit16 = (SimpleSymbol) new SimpleSymbol("List_View1").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("GetTags").readResolve();
        Lit14 = PairWithPosition.make(Lit18, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41487), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41481);
        Lit13 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41463), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41457);
        Lit12 = PairWithPosition.make(Lit18, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41426), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41420);
        Lit11 = IntNum.make(1);
        Lit10 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit290, LList.Empty, "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41410), "/tmp/1654323858162_0.07108711846651938-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSP2020LANJUTAN/CariSLS.yail", 41404);
        Lit9 = (SimpleSymbol) new SimpleSymbol("$item").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("Tiny_DB10").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("$Data").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("p$Tampilkan").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("g$SLS").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$NKS").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("CariSLS").readResolve();
    }

    public CariSLS() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 3, Lit276, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 4, Lit277, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 5, Lit278, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 6, Lit279, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 8, Lit280, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 9, Lit281, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 10, Lit282, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 11, Lit283, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 12, Lit284, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 13, Lit285, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 14, Lit286, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 15, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 16, Lit287, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 17, Lit288, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 18, Lit289, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 19, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4335152769950135233.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 20, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 21, null, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 22, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 23, null, 0);
        lambda$Fn7 = new ModuleMethod(frameVar, 24, null, 0);
        lambda$Fn6 = new ModuleMethod(frameVar, 25, null, 0);
        lambda$Fn9 = new ModuleMethod(frameVar, 26, null, 0);
        this.CariSLS$Initialize = new ModuleMethod(frameVar, 27, Lit54, 0);
        lambda$Fn10 = new ModuleMethod(frameVar, 28, null, 0);
        lambda$Fn11 = new ModuleMethod(frameVar, 29, null, 0);
        this.View_Pager1$PageSelected = new ModuleMethod(frameVar, 30, Lit63, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn12 = new ModuleMethod(frameVar, 31, null, 0);
        lambda$Fn13 = new ModuleMethod(frameVar, 32, null, 0);
        lambda$Fn14 = new ModuleMethod(frameVar, 33, null, 0);
        lambda$Fn15 = new ModuleMethod(frameVar, 34, null, 0);
        lambda$Fn16 = new ModuleMethod(frameVar, 35, null, 0);
        lambda$Fn17 = new ModuleMethod(frameVar, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(frameVar, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(frameVar, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(frameVar, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(frameVar, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(frameVar, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(frameVar, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frameVar, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(frameVar, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frameVar, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frameVar, 46, null, 0);
        lambda$Fn28 = new ModuleMethod(frameVar, 47, null, 0);
        lambda$Fn29 = new ModuleMethod(frameVar, 48, null, 0);
        lambda$Fn30 = new ModuleMethod(frameVar, 49, null, 0);
        lambda$Fn31 = new ModuleMethod(frameVar, 50, null, 0);
        lambda$Fn32 = new ModuleMethod(frameVar, 51, null, 0);
        lambda$Fn33 = new ModuleMethod(frameVar, 52, null, 0);
        lambda$Fn34 = new ModuleMethod(frameVar, 53, null, 0);
        lambda$Fn35 = new ModuleMethod(frameVar, 54, null, 0);
        lambda$Fn36 = new ModuleMethod(frameVar, 55, null, 0);
        lambda$Fn37 = new ModuleMethod(frameVar, 56, null, 0);
        this.ButtonSimpan$Click = new ModuleMethod(frameVar, 57, Lit137, 0);
        lambda$Fn38 = new ModuleMethod(frameVar, 58, null, 0);
        lambda$Fn39 = new ModuleMethod(frameVar, 59, null, 0);
        lambda$Fn40 = new ModuleMethod(frameVar, 60, null, 0);
        lambda$Fn41 = new ModuleMethod(frameVar, 61, null, 0);
        lambda$Fn42 = new ModuleMethod(frameVar, 62, null, 0);
        lambda$Fn43 = new ModuleMethod(frameVar, 63, null, 0);
        lambda$Fn44 = new ModuleMethod(frameVar, 64, null, 0);
        lambda$Fn45 = new ModuleMethod(frameVar, 65, null, 0);
        lambda$Fn46 = new ModuleMethod(frameVar, 66, null, 0);
        lambda$Fn47 = new ModuleMethod(frameVar, 67, null, 0);
        lambda$Fn48 = new ModuleMethod(frameVar, 68, null, 0);
        lambda$Fn49 = new ModuleMethod(frameVar, 69, null, 0);
        lambda$Fn50 = new ModuleMethod(frameVar, 70, null, 0);
        lambda$Fn51 = new ModuleMethod(frameVar, 71, null, 0);
        lambda$Fn52 = new ModuleMethod(frameVar, 72, null, 0);
        lambda$Fn53 = new ModuleMethod(frameVar, 73, null, 0);
        lambda$Fn54 = new ModuleMethod(frameVar, 74, null, 0);
        lambda$Fn55 = new ModuleMethod(frameVar, 75, null, 0);
        this.List_View2$AfterPicking = new ModuleMethod(frameVar, 76, Lit196, 0);
        lambda$Fn56 = new ModuleMethod(frameVar, 77, null, 0);
        lambda$Fn57 = new ModuleMethod(frameVar, 78, null, 0);
        lambda$Fn58 = new ModuleMethod(frameVar, 79, null, 0);
        lambda$Fn59 = new ModuleMethod(frameVar, 80, null, 0);
        lambda$Fn60 = new ModuleMethod(frameVar, 81, null, 0);
        lambda$Fn61 = new ModuleMethod(frameVar, 82, null, 0);
        lambda$Fn62 = new ModuleMethod(frameVar, 83, null, 0);
        lambda$Fn63 = new ModuleMethod(frameVar, 84, null, 0);
        lambda$Fn64 = new ModuleMethod(frameVar, 85, null, 0);
        lambda$Fn65 = new ModuleMethod(frameVar, 86, null, 0);
        this.List_View1$LongClick = new ModuleMethod(frameVar, 87, Lit225, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(frameVar, 88, Lit240, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn66 = new ModuleMethod(frameVar, 89, null, 0);
        lambda$Fn67 = new ModuleMethod(frameVar, 90, null, 0);
        this.Floating_Action_Button1$Click = new ModuleMethod(frameVar, 91, Lit249, 0);
        lambda$Fn68 = new ModuleMethod(frameVar, 92, null, 0);
        lambda$Fn69 = new ModuleMethod(frameVar, 93, null, 0);
        lambda$Fn70 = new ModuleMethod(frameVar, 94, null, 0);
        lambda$Fn71 = new ModuleMethod(frameVar, 95, null, 0);
        this.Floating_Action_Refresh$Click = new ModuleMethod(frameVar, 96, Lit260, 0);
        this.Notifier2$AfterChoosing = new ModuleMethod(frameVar, 97, Lit266, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.File1$GotText = new ModuleMethod(frameVar, 98, Lit274, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th;
        CallContext callContext = CallContext.getInstance();
        Consumer consumer = callContext.consumer;
        callContext.consumer = VoidConsumer.instance;
        try {
            run(callContext);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(callContext, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(Lit0.toString());
        FString stringAppend = strings.stringAppend(Lit0.toString(), "-global-vars");
        this.global$Mnvar$Mnenvironment = Environment.make(stringAppend == null ? null : stringAppend.toString());
        CariSLS = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, ""), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit4, lambda$Fn3);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, lambda$Fn4), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn6);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit26);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "4734536543895552", Lit28);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "SIMPELSP2020LANJUTAN", Lit28);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit30, Lit31, Lit26);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit32, Lit33, Lit26);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit34, AlgorithmIdentifiers.NONE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.TRUE, Lit36);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit37, "SIMPEL SP2020 LANJUTAN", Lit28);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit38, " ID NKS", Lit28), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn9));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit54, this.CariSLS$Initialize);
        } else {
            addToFormEnvironment(Lit54, this.CariSLS$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "CariSLS", "Initialize");
        } else {
            addToEvents(Lit0, Lit55);
        }
        this.View_Pager1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit56, Lit48, lambda$Fn10), $result);
        } else {
            addToComponents(Lit0, Lit59, Lit48, lambda$Fn11);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit63, this.View_Pager1$PageSelected);
        } else {
            addToFormEnvironment(Lit63, this.View_Pager1$PageSelected);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "View_Pager1", "PageSelected");
        } else {
            addToEvents(Lit48, Lit64);
        }
        this.Space1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit65, Lit66, lambda$Fn12), $result);
        } else {
            addToComponents(Lit0, Lit69, Lit66, lambda$Fn13);
        }
        this.Vertical_Scroll_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit50, lambda$Fn14), $result);
        } else {
            addToComponents(Lit0, Lit73, Lit50, lambda$Fn15);
        }
        this.Label6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit74, Lit75, lambda$Fn16), $result);
        } else {
            addToComponents(Lit50, Lit83, Lit75, lambda$Fn17);
        }
        this.Label6_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit84, Lit85, lambda$Fn18), $result);
        } else {
            addToComponents(Lit50, Lit87, Lit85, lambda$Fn19);
        }
        this.Label6_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit88, Lit89, lambda$Fn20), $result);
        } else {
            addToComponents(Lit50, Lit91, Lit89, lambda$Fn21);
        }
        this.Space1_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit92, Lit93, lambda$Fn22), $result);
        } else {
            addToComponents(Lit50, Lit95, Lit93, lambda$Fn23);
        }
        this.Horizontal_Arrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit96, Lit97, lambda$Fn24), $result);
        } else {
            addToComponents(Lit50, Lit98, Lit97, lambda$Fn25);
        }
        this.Text_BoxIDNKS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit97, Lit99, Lit44, lambda$Fn26), $result);
        } else {
            addToComponents(Lit97, Lit107, Lit44, lambda$Fn27);
        }
        this.Space1_copy2_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit108, Lit109, lambda$Fn28), $result);
        } else {
            addToComponents(Lit50, Lit111, Lit109, lambda$Fn29);
        }
        this.Horizontal_Arrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit112, Lit113, lambda$Fn30), $result);
        } else {
            addToComponents(Lit50, Lit114, Lit113, lambda$Fn31);
        }
        this.Space1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit113, Lit115, Lit116, lambda$Fn32), $result);
        } else {
            addToComponents(Lit113, Lit119, Lit116, lambda$Fn33);
        }
        this.Space1_copy2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit113, Lit120, Lit121, lambda$Fn34), $result);
        } else {
            addToComponents(Lit113, Lit124, Lit121, lambda$Fn35);
        }
        this.ButtonSimpan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit113, Lit125, Lit126, lambda$Fn36), $result);
        } else {
            addToComponents(Lit113, Lit130, Lit126, lambda$Fn37);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit137, this.ButtonSimpan$Click);
        } else {
            addToFormEnvironment(Lit137, this.ButtonSimpan$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonSimpan", "Click");
        } else {
            addToEvents(Lit126, Lit138);
        }
        this.Space1_copy2_copy_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit139, Lit140, lambda$Fn38), $result);
        } else {
            addToComponents(Lit50, Lit142, Lit140, lambda$Fn39);
        }
        this.Label6_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit143, Lit144, lambda$Fn40), $result);
        } else {
            addToComponents(Lit50, Lit146, Lit144, lambda$Fn41);
        }
        this.Label6_copy_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit147, Lit148, lambda$Fn42), $result);
        } else {
            addToComponents(Lit50, Lit150, Lit148, lambda$Fn43);
        }
        this.Label6_copy_copy_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit151, Lit152, lambda$Fn44), $result);
        } else {
            addToComponents(Lit50, Lit154, Lit152, lambda$Fn45);
        }
        this.Label6_copy_copy_copy_copy_copy_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit155, Lit156, lambda$Fn46), $result);
        } else {
            addToComponents(Lit50, Lit158, Lit156, lambda$Fn47);
        }
        this.Label6_copy_copy_copy_copy_copy1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit159, Lit160, lambda$Fn48), $result);
        } else {
            addToComponents(Lit50, Lit162, Lit160, lambda$Fn49);
        }
        this.Label6_copy_copy_copy_copy_copy1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit163, Lit164, lambda$Fn50), $result);
        } else {
            addToComponents(Lit50, Lit166, Lit164, lambda$Fn51);
        }
        this.Space1_copy2_copy_copy1_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit167, Lit168, lambda$Fn52), $result);
        } else {
            addToComponents(Lit50, Lit170, Lit168, lambda$Fn53);
        }
        this.List_View2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit171, Lit172, lambda$Fn54), $result);
        } else {
            addToComponents(Lit50, Lit190, Lit172, lambda$Fn55);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit196, this.List_View2$AfterPicking);
        } else {
            addToFormEnvironment(Lit196, this.List_View2$AfterPicking);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "List_View2", "AfterPicking");
        } else {
            addToEvents(Lit172, Lit197);
        }
        this.Space1_copy2_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit198, Lit199, lambda$Fn56), $result);
        } else {
            addToComponents(Lit0, Lit201, Lit199, lambda$Fn57);
        }
        this.Vertical_Scroll_Arrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit202, Lit52, lambda$Fn58), $result);
        } else {
            addToComponents(Lit0, Lit203, Lit52, lambda$Fn59);
        }
        this.Label5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit204, Lit205, lambda$Fn60), $result);
        } else {
            addToComponents(Lit52, Lit208, Lit205, lambda$Fn61);
        }
        this.Space2_copy = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit209, Lit210, lambda$Fn62), $result);
        } else {
            addToComponents(Lit52, Lit212, Lit210, lambda$Fn63);
        }
        this.List_View1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit213, Lit16, lambda$Fn64), $result);
        } else {
            addToComponents(Lit52, Lit219, Lit16, lambda$Fn65);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit225, this.List_View1$LongClick);
        } else {
            addToFormEnvironment(Lit225, this.List_View1$LongClick);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "List_View1", "LongClick");
        } else {
            addToEvents(Lit16, Lit226);
        }
        this.Decoration1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit227, Lit42, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit228, Lit42, Boolean.FALSE);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit229, Lit230, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit231, Lit230, Boolean.FALSE);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit232, Lit132, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit233, Lit132, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit240, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit240, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit132, Lit241);
        }
        this.Floating_Action_Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit242, Lit243, lambda$Fn66), $result);
        } else {
            addToComponents(Lit0, Lit247, Lit243, lambda$Fn67);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit249, this.Floating_Action_Button1$Click);
        } else {
            addToFormEnvironment(Lit249, this.Floating_Action_Button1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Floating_Action_Button1", "Click");
        } else {
            addToEvents(Lit243, Lit138);
        }
        this.Tiny_DB10 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit250, Lit7, lambda$Fn68), $result);
        } else {
            addToComponents(Lit0, Lit252, Lit7, lambda$Fn69);
        }
        this.Floating_Action_Refresh = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit253, Lit254, lambda$Fn70), $result);
        } else {
            addToComponents(Lit0, Lit258, Lit254, lambda$Fn71);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit260, this.Floating_Action_Refresh$Click);
        } else {
            addToFormEnvironment(Lit260, this.Floating_Action_Refresh$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Floating_Action_Refresh", "Click");
        } else {
            addToEvents(Lit254, Lit138);
        }
        this.Notifier2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit261, Lit223, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit262, Lit223, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit266, this.Notifier2$AfterChoosing);
        } else {
            addToFormEnvironment(Lit266, this.Notifier2$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier2", "AfterChoosing");
        } else {
            addToEvents(Lit223, Lit241);
        }
        this.Notifier3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit267, Lit268, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit269, Lit268, Boolean.FALSE);
        }
        this.File1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit270, Lit39, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit271, Lit39, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit274, this.File1$GotText);
        } else {
            addToFormEnvironment(Lit274, this.File1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "File1", "GotText");
        } else {
            addToEvents(Lit39, Lit275);
        }
        runtime.initRuntime();
    }

    static String lambda3() {
        return "";
    }

    /* compiled from: CariSLS.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        CariSLS $main;

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 19:
                    return CariSLS.lambda2();
                case 20:
                    this.$main.$define();
                    return Values.empty;
                case 21:
                    return CariSLS.lambda3();
                case 22:
                    return CariSLS.lambda4();
                case 23:
                    return CariSLS.lambda5();
                case 24:
                    return CariSLS.lambda8();
                case 25:
                    return CariSLS.lambda7();
                case 26:
                    return CariSLS.lambda10();
                case 27:
                    return this.$main.CariSLS$Initialize();
                case 28:
                    return CariSLS.lambda11();
                case 29:
                    return CariSLS.lambda12();
                case 30:
                case 88:
                default:
                    return super.apply0(moduleMethod);
                case 31:
                    return CariSLS.lambda13();
                case 32:
                    return CariSLS.lambda14();
                case 33:
                    return CariSLS.lambda15();
                case 34:
                    return CariSLS.lambda16();
                case 35:
                    return CariSLS.lambda17();
                case 36:
                    return CariSLS.lambda18();
                case 37:
                    return CariSLS.lambda19();
                case 38:
                    return CariSLS.lambda20();
                case 39:
                    return CariSLS.lambda21();
                case 40:
                    return CariSLS.lambda22();
                case 41:
                    return CariSLS.lambda23();
                case 42:
                    return CariSLS.lambda24();
                case 43:
                    return CariSLS.lambda25();
                case 44:
                    return CariSLS.lambda26();
                case 45:
                    return CariSLS.lambda27();
                case 46:
                    return CariSLS.lambda28();
                case 47:
                    return CariSLS.lambda29();
                case 48:
                    return CariSLS.lambda30();
                case 49:
                    return CariSLS.lambda31();
                case 50:
                    return CariSLS.lambda32();
                case 51:
                    return CariSLS.lambda33();
                case 52:
                    return CariSLS.lambda34();
                case 53:
                    return CariSLS.lambda35();
                case 54:
                    return CariSLS.lambda36();
                case 55:
                    return CariSLS.lambda37();
                case 56:
                    return CariSLS.lambda38();
                case 57:
                    return this.$main.ButtonSimpan$Click();
                case 58:
                    return CariSLS.lambda39();
                case 59:
                    return CariSLS.lambda40();
                case 60:
                    return CariSLS.lambda41();
                case 61:
                    return CariSLS.lambda42();
                case 62:
                    return CariSLS.lambda43();
                case 63:
                    return CariSLS.lambda44();
                case 64:
                    return CariSLS.lambda45();
                case 65:
                    return CariSLS.lambda46();
                case 66:
                    return CariSLS.lambda47();
                case 67:
                    return CariSLS.lambda48();
                case 68:
                    return CariSLS.lambda49();
                case 69:
                    return CariSLS.lambda50();
                case 70:
                    return CariSLS.lambda51();
                case 71:
                    return CariSLS.lambda52();
                case 72:
                    return CariSLS.lambda53();
                case 73:
                    return CariSLS.lambda54();
                case 74:
                    return CariSLS.lambda55();
                case 75:
                    return CariSLS.lambda56();
                case 76:
                    return this.$main.List_View2$AfterPicking();
                case 77:
                    return CariSLS.lambda57();
                case 78:
                    return CariSLS.lambda58();
                case 79:
                    return CariSLS.lambda59();
                case 80:
                    return CariSLS.lambda60();
                case 81:
                    return CariSLS.lambda61();
                case 82:
                    return CariSLS.lambda62();
                case 83:
                    return CariSLS.lambda63();
                case 84:
                    return CariSLS.lambda64();
                case 85:
                    return CariSLS.lambda65();
                case 86:
                    return CariSLS.lambda66();
                case 87:
                    return this.$main.List_View1$LongClick();
                case 89:
                    return CariSLS.lambda67();
                case 90:
                    return CariSLS.lambda68();
                case 91:
                    return this.$main.Floating_Action_Button1$Click();
                case 92:
                    return CariSLS.lambda69();
                case 93:
                    return CariSLS.lambda70();
                case 94:
                    return CariSLS.lambda71();
                case 95:
                    return CariSLS.lambda72();
                case 96:
                    return this.$main.Floating_Action_Refresh$Click();
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                case 88:
                default:
                    return super.match0(moduleMethod, callContext);
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 70:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 74:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 76:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 77:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 78:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 82:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 83:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 90:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 91:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 92:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 93:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 94:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 95:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 96:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 6:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 8:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 15:
                    if (obj instanceof CariSLS) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 30:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 88:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 97:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 98:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 5:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 6:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 7:
                case 8:
                case 11:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
                case 9:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 18:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (obj instanceof CariSLS) {
                        callContext.value1 = obj;
                        if (obj2 instanceof Component) {
                            callContext.value2 = obj2;
                            if (obj3 instanceof String) {
                                callContext.value3 = obj3;
                                if (obj4 instanceof String) {
                                    callContext.value4 = obj4;
                                    callContext.proc = moduleMethod;
                                    callContext.pc = 4;
                                    return 0;
                                }
                                return -786428;
                            }
                            return -786429;
                        }
                        return -786430;
                    }
                    return -786431;
                case 17:
                    if (obj instanceof CariSLS) {
                        callContext.value1 = obj;
                        if (obj2 instanceof Component) {
                            callContext.value2 = obj2;
                            if (obj3 instanceof String) {
                                callContext.value3 = obj3;
                                if (1 != 0) {
                                    callContext.value4 = obj4;
                                    callContext.proc = moduleMethod;
                                    callContext.pc = 4;
                                    return 0;
                                }
                                return -786428;
                            }
                            return -786429;
                        }
                        return -786430;
                    }
                    return -786431;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 3:
                    return this.$main.getSimpleName(obj);
                case 4:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 6:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 13:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 14:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 15:
                    this.$main.processException(obj);
                    return Values.empty;
                case 30:
                    return this.$main.View_Pager1$PageSelected(obj);
                case 88:
                    return this.$main.Notifier1$AfterChoosing(obj);
                case 97:
                    return this.$main.Notifier2$AfterChoosing(obj);
                case 98:
                    return this.$main.File1$GotText(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 11:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 16:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 17:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj, (String) obj2, obj3 != Boolean.FALSE, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 5:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                case 8:
                case 11:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                default:
                    return super.apply2(moduleMethod, obj, obj2);
                case 9:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 10:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 12:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 18:
                    return this.$main.lookupHandler(obj, obj2);
            }
        }
    }

    /* compiled from: CariSLS.yail */
    /* loaded from: classes.dex */
    public class frame0 extends ModuleBody {
        Object $Data;
        final ModuleMethod proc$Fn5 = new ModuleMethod(this, 1, CariSLS.Lit19, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 1 ? lambda6proc(obj) : super.apply1(moduleMethod, obj);
        }

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector == 1) {
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.pc = 1;
                return 0;
            }
            return super.match1(moduleMethod, obj, callContext);
        }

        public Object lambda6proc(Object $item) {
            return runtime.callYailPrimitive(runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex, LList.list2(this.$Data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(CariSLS.Lit6), " is not bound in the current context"), "Unbound Variable") : this.$Data, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("NKS :", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callComponentMethod(CariSLS.Lit7, CariSLS.Lit8, LList.list2($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(CariSLS.Lit9), " is not bound in the current context"), "Unbound Variable") : $item, ""), CariSLS.Lit10), CariSLS.Lit11), CariSLS.Lit12, "select list item")), CariSLS.Lit13, "join")), CariSLS.Lit14, "add items to list");
        }
    }

    /* compiled from: CariSLS.yail */
    /* loaded from: classes.dex */
    public class frame1 extends ModuleBody {
        Object $Data;
        final ModuleMethod proc$Fn8 = new ModuleMethod(this, 2, CariSLS.Lit19, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 2 ? lambda9proc(obj) : super.apply1(moduleMethod, obj);
        }

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector == 2) {
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.pc = 1;
                return 0;
            }
            return super.match1(moduleMethod, obj, callContext);
        }

        public Object lambda9proc(Object $item) {
            return runtime.callYailPrimitive(runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex, LList.list2(this.$Data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(CariSLS.Lit6), " is not bound in the current context"), "Unbound Variable") : this.$Data, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("NKS :", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callComponentMethod(CariSLS.Lit7, CariSLS.Lit8, LList.list2($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(CariSLS.Lit9), " is not bound in the current context"), "Unbound Variable") : $item, ""), CariSLS.Lit20), CariSLS.Lit11), CariSLS.Lit21, "select list item")), CariSLS.Lit22, "join")), CariSLS.Lit23, "add items to list");
        }
    }

    static Object lambda4() {
        return runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static Object lambda5() {
        frame0 closureEnv = new frame0();
        closureEnv.$Data = runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        ModuleMethod moduleMethod = closureEnv.proc$Fn5;
        runtime.yailForEach(closureEnv.proc$Fn5, runtime.callComponentMethod(Lit7, Lit15, LList.Empty, LList.Empty));
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit17, closureEnv.$Data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit6), " is not bound in the current context"), "Unbound Variable") : closureEnv.$Data, Lit18);
    }

    static Procedure lambda7() {
        return lambda$Fn7;
    }

    static Object lambda8() {
        frame1 closureEnv = new frame1();
        closureEnv.$Data = runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        ModuleMethod moduleMethod = closureEnv.proc$Fn8;
        runtime.yailForEach(closureEnv.proc$Fn8, runtime.callComponentMethod(Lit7, Lit15, LList.Empty, LList.Empty));
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit17, closureEnv.$Data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit6), " is not bound in the current context"), "Unbound Variable") : closureEnv.$Data, Lit18);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "4734536543895552", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "SIMPELSP2020LANJUTAN", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit30, Lit31, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit32, Lit33, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit34, AlgorithmIdentifiers.NONE, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit37, "SIMPEL SP2020 LANJUTAN", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit38, " ID NKS", Lit28);
    }

    public Object CariSLS$Initialize() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit39, Lit40, LList.list1("//simpeldsbs.csv"), Lit41);
        runtime.callComponentMethod(Lit42, Lit43, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit44), Lit45, Lit46, Boolean.TRUE), Lit47);
        runtime.callComponentMethod(Lit48, Lit49, LList.list2(runtime.lookupInCurrentFormEnvironment(Lit50), "CARI ID NKS"), Lit51);
        runtime.callComponentMethod(Lit48, Lit49, LList.list2(runtime.lookupInCurrentFormEnvironment(Lit52), "WILAYAH TUGAS"), Lit53);
        return Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit57, Lit58, Lit26);
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit57, Lit58, Lit26);
    }

    public Object View_Pager1$PageSelected(Object $position) {
        runtime.sanitizeComponentData($position);
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit48, Lit60), "CARI ID NKS"), Lit61, "=") != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit52, Lit62, Boolean.FALSE, Lit36) : runtime.setAndCoerceProperty$Ex(Lit52, Lit62, Boolean.TRUE, Lit36);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit67, Lit68, Lit26);
    }

    static Object lambda14() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit67, Lit68, Lit26);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit71, Lit72, Lit26);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit71, Lit72, Lit26);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit79, "ID NKS BERJUMLAH 6 DIGIT", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit81, Lit82, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit71, Lit72, Lit26);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit79, "ID NKS BERJUMLAH 6 DIGIT", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit81, Lit82, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit71, Lit72, Lit26);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit79, "2 DIGIT PERTAMA KODE KAB/KOTA", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit81, Lit86, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit71, Lit72, Lit26);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit79, "2 DIGIT PERTAMA KODE KAB/KOTA", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit81, Lit86, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit71, Lit72, Lit26);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit79, "4 DIGIT BERIKUTNYA KODE NKS", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit81, Lit90, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit71, Lit72, Lit26);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit79, "4 DIGIT BERIKUTNYA KODE NKS", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit81, Lit90, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit71, Lit72, Lit26);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit67, Lit94, Lit26);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit67, Lit94, Lit26);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit71, Lit72, Lit26);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit71, Lit72, Lit26);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit77, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit101, Lit102, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit103, Lit104, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit105, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit80, Lit11, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit81, Lit106, Lit26);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit77, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit101, Lit102, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit103, Lit104, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit105, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit80, Lit11, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit81, Lit106, Lit26);
    }

    static Object lambda29() {
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit67, Lit110, Lit26);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit67, Lit110, Lit26);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit113, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit71, Lit72, Lit26);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit113, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit71, Lit72, Lit26);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit116, Lit67, Lit117, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit71, Lit118, Lit26);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit116, Lit67, Lit117, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit71, Lit118, Lit26);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit121, Lit67, Lit122, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit71, Lit123, Lit26);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit121, Lit67, Lit122, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit71, Lit123, Lit26);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit126, Lit127, Lit128, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit129, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit79, "SIMPAN ID NKS", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit62, Boolean.FALSE, Lit36);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit126, Lit127, Lit128, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit129, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit79, "SIMPAN ID NKS", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit62, Boolean.FALSE, Lit36);
    }

    public Object ButtonSimpan$Click() {
        Object callComponentMethod;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit44, Lit79), ""), Lit131, "=") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit132, Lit133, LList.list3("ID NKS Tidak Boleh Kosong", "Error !!!", "OK"), Lit134);
        } else {
            SimpleSymbol simpleSymbol = Lit132;
            SimpleSymbol simpleSymbol2 = Lit135;
            Pair list1 = LList.list1("Simpan ID NKS... !!!");
            LList.chain4(list1, "SIMPAN", "Ya", "", Boolean.TRUE);
            callComponentMethod = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit136);
        }
        return callComponentMethod;
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit140, Lit67, Lit141, Lit26);
    }

    static Object lambda40() {
        return runtime.setAndCoerceProperty$Ex(Lit140, Lit67, Lit141, Lit26);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit144, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit79, "MASUKAN ID NKS YANG INGIN DICARI DI", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit81, Lit145, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit144, Lit71, Lit72, Lit26);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit144, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit79, "MASUKAN ID NKS YANG INGIN DICARI DI", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit81, Lit145, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit144, Lit71, Lit72, Lit26);
    }

    static Object lambda43() {
        runtime.setAndCoerceProperty$Ex(Lit148, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit79, "Search Bar KETIKAN ID NKS DI SINI", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit81, Lit149, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit148, Lit71, Lit72, Lit26);
    }

    static Object lambda44() {
        runtime.setAndCoerceProperty$Ex(Lit148, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit79, "Search Bar KETIKAN ID NKS DI SINI", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit81, Lit149, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit148, Lit71, Lit72, Lit26);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit152, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit79, "Setelah ID NKS Di Temukan", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit81, Lit153, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit152, Lit71, Lit72, Lit26);
    }

    static Object lambda46() {
        runtime.setAndCoerceProperty$Ex(Lit152, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit79, "Setelah ID NKS Di Temukan", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit152, Lit81, Lit153, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit152, Lit71, Lit72, Lit26);
    }

    static Object lambda47() {
        runtime.setAndCoerceProperty$Ex(Lit156, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit79, "Klik ID NKS Di ListView", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit81, Lit157, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit156, Lit71, Lit72, Lit26);
    }

    static Object lambda48() {
        runtime.setAndCoerceProperty$Ex(Lit156, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit79, "Klik ID NKS Di ListView", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit156, Lit81, Lit157, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit156, Lit71, Lit72, Lit26);
    }

    static Object lambda49() {
        runtime.setAndCoerceProperty$Ex(Lit160, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit79, "ID NKS Akan Masuk Ke Teks Box", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit81, Lit161, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit160, Lit71, Lit72, Lit26);
    }

    static Object lambda50() {
        runtime.setAndCoerceProperty$Ex(Lit160, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit79, "ID NKS Akan Masuk Ke Teks Box", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit160, Lit81, Lit161, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit160, Lit71, Lit72, Lit26);
    }

    static Object lambda51() {
        runtime.setAndCoerceProperty$Ex(Lit164, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit79, " Kemudian Klik Simpan", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit81, Lit165, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit164, Lit71, Lit72, Lit26);
    }

    static Object lambda52() {
        runtime.setAndCoerceProperty$Ex(Lit164, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit77, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit79, " Kemudian Klik Simpan", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit81, Lit165, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit164, Lit71, Lit72, Lit26);
    }

    static Object lambda53() {
        return runtime.setAndCoerceProperty$Ex(Lit168, Lit67, Lit169, Lit26);
    }

    static Object lambda54() {
        return runtime.setAndCoerceProperty$Ex(Lit168, Lit67, Lit169, Lit26);
    }

    static Object lambda55() {
        runtime.setAndCoerceProperty$Ex(Lit172, Lit127, Lit173, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit174, Lit175, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit176, Lit177, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit178, "Ketikan  ID NKS Di Sini...", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit179, Lit180, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit181, Lit182, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit183, Lit184, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit185, Lit186, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit187, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit188, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit189, Lit100, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit71, Lit72, Lit26);
    }

    static Object lambda56() {
        runtime.setAndCoerceProperty$Ex(Lit172, Lit127, Lit173, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit174, Lit175, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit176, Lit177, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit178, "Ketikan  ID NKS Di Sini...", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit179, Lit180, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit181, Lit182, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit183, Lit184, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit185, Lit186, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit187, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit188, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit172, Lit189, Lit100, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit71, Lit72, Lit26);
    }

    public Object List_View2$AfterPicking() {
        runtime.setThisForm();
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        Object $Tampung_List = runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.get$Mnproperty.apply2(Lit172, Lit191), "\n"), Lit192, "split");
        runtime.setAndCoerceProperty$Ex(Lit44, Lit79, runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($Tampung_List instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit193), " is not bound in the current context"), "Unbound Variable") : $Tampung_List, Lit11), Lit194, "select list item"), "", ""), Lit195, "replace all"), Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit62, Boolean.TRUE, Lit36);
    }

    static Object lambda57() {
        return runtime.setAndCoerceProperty$Ex(Lit199, Lit67, Lit200, Lit26);
    }

    static Object lambda58() {
        return runtime.setAndCoerceProperty$Ex(Lit199, Lit67, Lit200, Lit26);
    }

    static Object lambda59() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit24, Lit25, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit67, Lit72, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit62, Boolean.FALSE, Lit36);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit71, Lit72, Lit26);
    }

    static Object lambda60() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit24, Lit25, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit67, Lit72, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit62, Boolean.FALSE, Lit36);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit71, Lit72, Lit26);
    }

    static Object lambda61() {
        runtime.setAndCoerceProperty$Ex(Lit205, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit77, Lit206, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit79, "ID NKS WILAYAH TUGAS", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit81, Lit207, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit205, Lit71, Lit72, Lit26);
    }

    static Object lambda62() {
        runtime.setAndCoerceProperty$Ex(Lit205, Lit76, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit77, Lit206, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit79, "ID NKS WILAYAH TUGAS", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit80, Lit11, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit205, Lit81, Lit207, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit205, Lit71, Lit72, Lit26);
    }

    static Object lambda63() {
        return runtime.setAndCoerceProperty$Ex(Lit210, Lit67, Lit211, Lit26);
    }

    static Object lambda64() {
        return runtime.setAndCoerceProperty$Ex(Lit210, Lit67, Lit211, Lit26);
    }

    static Object lambda65() {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit174, Lit214, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit176, Lit215, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit179, Lit216, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit217, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit185, Lit218, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit188, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit189, Lit100, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit71, Lit72, Lit26);
    }

    static Object lambda66() {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit174, Lit214, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit176, Lit215, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit179, Lit216, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit217, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit185, Lit218, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit188, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit189, Lit100, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit71, Lit72, Lit26);
    }

    public Object List_View1$LongClick() {
        runtime.setThisForm();
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.get$Mnproperty.apply2(Lit16, Lit191), "<br>"), Lit220, "split"), Lit11), Lit221, "select list item"), "NKS :", ""), Lit222, "replace all"));
        SimpleSymbol simpleSymbol = Lit223;
        SimpleSymbol simpleSymbol2 = Lit135;
        Pair list1 = LList.list1(runtime.get$Mnproperty.apply2(Lit16, Lit191));
        LList.chain4(list1, "info", "", "Delete", Boolean.TRUE);
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit224);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($choice2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit234), " is not bound in the current context"), "Unbound Variable") : $choice2, "Ya"), Lit235, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit7, Lit236, LList.list2(runtime.get$Mnproperty.apply2(Lit44, Lit79), runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list1(runtime.get$Mnproperty.apply2(Lit44, Lit79)), Lit237, "make a list")), Lit238);
            runtime.callComponentMethod(Lit132, Lit133, LList.list3("Berhasil Simpan ID NKS", "Info...!!!", "OK"), Lit239);
        }
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit79, "", Lit28);
    }

    static Object lambda67() {
        runtime.setAndCoerceProperty$Ex(Lit243, Lit127, Lit244, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit243, Lit245, "exit.png", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit243, Lit246, "home", Lit28);
    }

    static Object lambda68() {
        runtime.setAndCoerceProperty$Ex(Lit243, Lit127, Lit244, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit243, Lit245, "exit.png", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit243, Lit246, "home", Lit28);
    }

    public Object Floating_Action_Button1$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen1"), Lit248, "close screen with value");
    }

    static Object lambda69() {
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit251, "TinyDB10", Lit28);
    }

    static Object lambda70() {
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit251, "TinyDB10", Lit28);
    }

    static Object lambda71() {
        runtime.setAndCoerceProperty$Ex(Lit254, Lit127, Lit255, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit254, Lit246, "refresh", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit254, Lit256, Lit257, Lit26);
    }

    static Object lambda72() {
        runtime.setAndCoerceProperty$Ex(Lit254, Lit127, Lit255, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit254, Lit246, "refresh", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit254, Lit256, Lit257, Lit26);
    }

    public Object Floating_Action_Refresh$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit0, Lit259, LList.Empty, LList.Empty);
        return Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    public Object Notifier2$AfterChoosing(Object $choice) {
        Object obj;
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($choice2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit234), " is not bound in the current context"), "Unbound Variable") : $choice2, "Delete"), Lit263, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit7, Lit264, LList.list1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit265);
            obj = Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
        } else {
            obj = Values.empty;
        }
        return obj;
    }

    public Object File1$GotText(Object $text) {
        Object $text2 = runtime.sanitizeComponentData($text);
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit17, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnfrom$Mncsv$Mnrow, LList.list1($text2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit272), " is not bound in the current context"), "Unbound Variable") : $text2), Lit273, "list from csv row"), Lit18);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        Object obj;
        int i = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (i == 0 ? i == 0 : !this.form$Mnenvironment.isBound(name)) {
            obj = default$Mnvalue;
        } else {
            obj = this.form$Mnenvironment.get(name);
        }
        return obj;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean z;
        boolean z2;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (isBoundInFormEnvironment(registeredObject)) {
            if (lookupInFormEnvironment(registeredObject) == componentObject) {
                Object handler = lookupHandler(registeredComponentName, eventName);
                try {
                    Scheme.apply.apply2(handler, LList.makeList(args, 0));
                    z2 = true;
                } catch (PermissionException exception) {
                    exception.printStackTrace();
                    boolean x = this == componentObject;
                    if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                        processException(exception);
                    } else {
                        PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                    }
                    z2 = false;
                } catch (Throwable exception2) {
                    androidLogForm(exception2.getMessage());
                    exception2.printStackTrace();
                    processException(exception2);
                    z2 = false;
                }
                z = z2;
            } else {
                z = false;
            }
        } else {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        }
        return z;
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        SimpleSymbol handler$Mnsymbol = misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName));
        Object handler = lookupInFormEnvironment(handler$Mnsymbol);
        if (handler != Boolean.FALSE) {
            try {
                Scheme.apply.apply2(handler, lists.cons(componentObject, lists.cons(notAlreadyHandled ? Boolean.TRUE : Boolean.FALSE, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(componentName == null ? null : componentName.toString(), eventName == null ? null : eventName.toString())));
    }

    @Override // com.google.appinventor.components.runtime.Form
    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        CariSLS = this;
        addToFormEnvironment(Lit0, this);
        LList events = this.events$Mnto$Mnregister;
        Object obj = events;
        while (true) {
            Object obj2 = obj;
            if (obj2 == LList.Empty) {
                break;
            }
            try {
                Pair arg0 = (Pair) obj2;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj3 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj3, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj2);
            }
        }
        try {
            Object components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            Object event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj4 = event$Mninfo2;
                try {
                    Pair arg02 = (Pair) obj4;
                    Object component$Mninfo = arg02.getCar();
                    Object component$Mnname = lists.caddr.apply1(component$Mninfo);
                    lists.cadddr.apply1(component$Mninfo);
                    Object component$Mntype = lists.cadr.apply1(component$Mninfo);
                    Object apply13 = lists.car.apply1(component$Mninfo);
                    try {
                        Object component$Mncontainer = lookupInFormEnvironment((Symbol) apply13);
                        Object component$Mnobject = Invoke.make.apply2(component$Mntype, component$Mncontainer);
                        SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                        try {
                            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                            event$Mninfo2 = arg02.getCdr();
                        } catch (ClassCastException e2) {
                            throw new WrongType(e2, "add-to-form-environment", 0, component$Mnname);
                        }
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "lookup-in-form-environment", 0, apply13);
                    }
                } catch (ClassCastException e4) {
                    throw new WrongType(e4, "arg0", -2, obj4);
                }
            }
            LList var$Mnval$Mnpairs = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            LList lList = var$Mnval$Mnpairs;
            while (lList != LList.Empty) {
                LList lList2 = lList;
                try {
                    Pair arg03 = (Pair) lList2;
                    Object var$Mnval = arg03.getCar();
                    Object var = lists.car.apply1(var$Mnval);
                    Object val$Mnthunk = lists.cadr.apply1(var$Mnval);
                    try {
                        addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(val$Mnthunk));
                        lList = arg03.getCdr();
                    } catch (ClassCastException e5) {
                        throw new WrongType(e5, "add-to-global-var-environment", 0, var);
                    }
                } catch (ClassCastException e6) {
                    throw new WrongType(e6, "arg0", -2, lList2);
                }
            }
            LList var$Mnval$Mnpairs2 = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (var$Mnval$Mnpairs2 != LList.Empty) {
                LList lList3 = var$Mnval$Mnpairs2;
                try {
                    Pair arg04 = (Pair) lList3;
                    misc.force(arg04.getCar());
                    var$Mnval$Mnpairs2 = arg04.getCdr();
                } catch (ClassCastException e7) {
                    throw new WrongType(e7, "arg0", -2, lList3);
                }
            }
            Object obj5 = components;
            while (obj5 != LList.Empty) {
                Object obj6 = obj5;
                try {
                    Pair arg05 = (Pair) obj6;
                    Object component$Mninfo2 = arg05.getCar();
                    lists.caddr.apply1(component$Mninfo2);
                    Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                    if (init$Mnthunk != Boolean.FALSE) {
                        Scheme.applyToArgs.apply1(init$Mnthunk);
                    }
                    obj5 = arg05.getCdr();
                } catch (ClassCastException e8) {
                    throw new WrongType(e8, "arg0", -2, obj6);
                }
            }
            Object obj7 = components;
            while (obj7 != LList.Empty) {
                Object obj8 = obj7;
                try {
                    Pair arg06 = (Pair) obj8;
                    Object component$Mninfo3 = arg06.getCar();
                    Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                    lists.cadddr.apply1(component$Mninfo3);
                    callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                    obj7 = arg06.getCdr();
                } catch (ClassCastException e9) {
                    throw new WrongType(e9, "arg0", -2, obj8);
                }
            }
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 != LList.Empty) {
                try {
                    Pair arg0 = (Pair) obj4;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    try {
                        obj2 = Pair.make(((Symbol) car).toString(), obj3);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "symbol->string", 1, car);
                    }
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "arg0", -2, obj4);
                }
            } else {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e3) {
                    throw new WrongType(e3, "string->symbol", 1, apply2);
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
