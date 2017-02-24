import org.web3d.x3d.jsail.*;
import org.web3d.x3d.jsail.CADGeometry.*;
import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.CubeMapTexturing.*;
import org.web3d.x3d.jsail.DIS.*;
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.EnvironmentalSensor.*;
import org.web3d.x3d.jsail.EventUtilities.*;
import org.web3d.x3d.jsail.Followers.*;
import org.web3d.x3d.jsail.Geometry2D.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Geospatial.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.HAnim.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.KeyDeviceSensor.*;
import org.web3d.x3d.jsail.Layering.*;
import org.web3d.x3d.jsail.Layout.*;
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.NURBS.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.ParticleSystems.*;
import org.web3d.x3d.jsail.Picking.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.RigidBodyPhysics.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shaders.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing3D.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;
import org.web3d.x3d.jsail.VolumeRendering.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.sai.*;
import org.web3d.x3d.sai.CADGeometry.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.CubeMapTexturing.*;
import org.web3d.x3d.sai.DIS.*;
import org.web3d.x3d.sai.EnvironmentalEffects.*;
import org.web3d.x3d.sai.EnvironmentalSensor.*;
import org.web3d.x3d.sai.EventUtilities.*;
import org.web3d.x3d.sai.Followers.*;
import org.web3d.x3d.sai.Geometry2D.*;
import org.web3d.x3d.sai.Geometry3D.*;
import org.web3d.x3d.sai.Geospatial.*;
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.HAnim.*;
import org.web3d.x3d.sai.Interpolation.*;
import org.web3d.x3d.sai.KeyDeviceSensor.*;
import org.web3d.x3d.sai.Layering.*;
import org.web3d.x3d.sai.Layout.*;
import org.web3d.x3d.sai.Lighting.*;
import org.web3d.x3d.sai.NURBS.*;
import org.web3d.x3d.sai.Navigation.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.ParticleSystems.*;
import org.web3d.x3d.sai.Picking.*;
import org.web3d.x3d.sai.PointingDeviceSensor.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.sai.Scripting.*;
import org.web3d.x3d.sai.Shaders.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Sound.*;
import org.web3d.x3d.sai.Text.*;
import org.web3d.x3d.sai.Texturing3D.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.sai.Time.*;
import org.web3d.x3d.sai.VolumeRendering.*;
public class cobweb {
	public static void main(String[] args) {
		X3DObject X3D0 = new X3DObject();
		headObject head0_0 = new headObject();
		metaObject meta0_0_0 = new metaObject();
		meta0_0_0.setName("title");
		meta0_0_0.setContent("cobweb.x3d");
		head0_0.addMeta(meta0_0_0);
		metaObject meta0_0_2 = new metaObject();
		meta0_0_2.setName("creator");
		meta0_0_2.setContent("John Carlson");
		head0_0.addMeta(meta0_0_2);
		metaObject meta0_0_4 = new metaObject();
		meta0_0_4.setName("description");
		meta0_0_4.setContent("Tour around a prismatic sphere");
		head0_0.addMeta(meta0_0_4);
		metaObject meta0_0_6 = new metaObject();
		meta0_0_6.setName("generator");
		meta0_0_6.setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit");
		head0_0.addMeta(meta0_0_6);
		metaObject meta0_0_8 = new metaObject();
		meta0_0_8.setName("identifier");
		meta0_0_8.setContent("http://coderextreme.net/X3DJSONLD/cobweb.x3d");
		head0_0.addMeta(meta0_0_8);
		X3D0.setHead(head0_0);
		SceneObject Scene0_2 = new SceneObject();
		NavigationInfoObject NavigationInfo0_2_0 = new NavigationInfoObject();
		NavigationInfo0_2_0.setType(new String[] {"EXAMINE"});
		Scene0_2.addChild(NavigationInfo0_2_0);
		ViewpointObject Viewpoint0_2_2 = new ViewpointObject();
		Viewpoint0_2_2.setPosition(new float[] {0f,0f,4f});
		Viewpoint0_2_2.setOrientation(new float[] {1f,0f,0f,0f});
		Viewpoint0_2_2.setDescription("Bubbles in action");
		Scene0_2.addChild(Viewpoint0_2_2);
		BackgroundObject Background0_2_4 = new BackgroundObject();
		Background0_2_4.setBackUrl(new String[] {"cubemap/BK.png","http://coderextreme.net/X3DJSONLD/cubemap/BK.png"});
		Background0_2_4.setBottomUrl(new String[] {"cubemap/BT.png","http://coderextreme.net/X3DJSONLD/cubemap/BT.png"});
		Background0_2_4.setFrontUrl(new String[] {"cubemap/FR.png","http://coderextreme.net/X3DJSONLD/cubemap/FR.png"});
		Background0_2_4.setLeftUrl(new String[] {"cubemap/LF.png","http://coderextreme.net/X3DJSONLD/cubemap/LF.png"});
		Background0_2_4.setRightUrl(new String[] {"cubemap/RT.png","http://coderextreme.net/X3DJSONLD/cubemap/RT.png"});
		Background0_2_4.setTopUrl(new String[] {"cubemap/TP.png","http://coderextreme.net/X3DJSONLD/cubemap/TP.png"});
		Scene0_2.addChild(Background0_2_4);
		ProtoDeclareObject ProtoDeclare0_2_6 = new ProtoDeclareObject();
		ProtoBodyObject ProtoBody0_2_6_0 = new ProtoBodyObject();
		TransformObject Transform0_2_6_0_0 = new TransformObject();
		ShapeObject Shape0_2_6_0_0_0 = new ShapeObject();
		SphereObject Sphere0_2_6_0_0_0_0 = new SphereObject();
		Shape0_2_6_0_0_0.setGeometry(Sphere0_2_6_0_0_0_0);
		Sphere0_2_6_0_0_0_0.setRadius(0.25f);
		AppearanceObject Appearance0_2_6_0_0_0_2 = new AppearanceObject();
		MaterialObject Material0_2_6_0_0_0_2_0 = new MaterialObject();
		Appearance0_2_6_0_0_0_2.setMaterial(Material0_2_6_0_0_0_2_0);
		Material0_2_6_0_0_0_2_0.setDiffuseColor(new float[] {1f,0f,0f});
		Material0_2_6_0_0_0_2_0.setTransparency(0.2f);
		Shape0_2_6_0_0_0.setAppearance(Appearance0_2_6_0_0_0_2);
		Transform0_2_6_0_0.addChild(Shape0_2_6_0_0_0);
		ScriptObject Script0_2_6_0_0_2 = new ScriptObject();
		fieldObject field0_2_6_0_0_2_0 = new fieldObject();
		field0_2_6_0_0_2_0.setName("scale");
		field0_2_6_0_0_2_0.setAccessType("inputOutput");
		field0_2_6_0_0_2_0.setType("SFVec3f");
		field0_2_6_0_0_2_0.setValue("1 1 1");
		Script0_2_6_0_0_2.addField(field0_2_6_0_0_2_0);
		fieldObject field0_2_6_0_0_2_2 = new fieldObject();
		field0_2_6_0_0_2_2.setName("translation");
		field0_2_6_0_0_2_2.setAccessType("inputOutput");
		field0_2_6_0_0_2_2.setType("SFVec3f");
		field0_2_6_0_0_2_2.setValue("0 0 0");
		Script0_2_6_0_0_2.addField(field0_2_6_0_0_2_2);
		fieldObject field0_2_6_0_0_2_4 = new fieldObject();
		field0_2_6_0_0_2_4.setName("velocity");
		field0_2_6_0_0_2_4.setAccessType("inputOutput");
		field0_2_6_0_0_2_4.setType("SFVec3f");
		field0_2_6_0_0_2_4.setValue("0 0 0");
		Script0_2_6_0_0_2.addField(field0_2_6_0_0_2_4);
		fieldObject field0_2_6_0_0_2_6 = new fieldObject();
		field0_2_6_0_0_2_6.setName("scalvel");
		field0_2_6_0_0_2_6.setAccessType("inputOutput");
		field0_2_6_0_0_2_6.setType("SFVec3f");
		field0_2_6_0_0_2_6.setValue("0 0 0");
		Script0_2_6_0_0_2.addField(field0_2_6_0_0_2_6);
		fieldObject field0_2_6_0_0_2_8 = new fieldObject();
		field0_2_6_0_0_2_8.setName("set_fraction");
		field0_2_6_0_0_2_8.setAccessType("inputOnly");
		field0_2_6_0_0_2_8.setType("SFFloat");
		Script0_2_6_0_0_2.addField(field0_2_6_0_0_2_8);
		Script0_2_6_0_0_2.setSourceCode("ecmascript:\n"+
"function initialize() {\n"+
"    velocity = new SFVec3f(Math.random() * 0.25 - 0.125, Math.random() * 0.25 - 0.125, Math.random() * 0.25 - 0.125);\n"+
"\n"+
"    scalvel = new SFVec3f(Math.random() * 0.4, Math.random() * 0.4, Math.random() * 0.4);\n"+
"}\n"+
"\n"+
"function set_translation(value) {\n"+
"   translation = value;\n"+
"}\n"+
"\n"+
"function set_scale(value) {\n"+
"   scale = value;\n"+
"}\n"+
"\n"+
"function translation_changed() {\n"+
"	return translation;\n"+
"}\n"+
"\n"+
"function set_fraction(value) {\n"+
"    translation = new SFVec3f(	translation[0] + velocity[0], translation[1] + velocity[1], translation[2] + velocity[2]);\n"+
"    scale = new SFVec3f(scale[0] + scalvel[0], scale[1] + scalvel[1], scale[2] + scalvel[2]);\n"+
"    for (var j = 0; j < 3; j++) {\n"+
"	    // if you get to far away or too big, explode\n"+
"	    if ( Math.abs(translation[j]) > 256) {\n"+
"		translation[j] = 0;\n"+
"		initialize();\n"+
"	    }\n"+
"	    if (Math.abs(scale[j]) > 20) {\n"+
"		scale[j] = scale[j]/2;\n"+
"		translation[j] = 0;\n"+
"		initialize();\n"+
"	    }\n"+
"    }\n"+
"}\n"+
"");
		Script0_2_6_0_0_2.setDEF("bounce");
		Transform0_2_6_0_0.addChild(Script0_2_6_0_0_2);
		TimeSensorObject TimeSensor0_2_6_0_0_4 = new TimeSensorObject();
		TimeSensor0_2_6_0_0_4.setDEF("bubbleClock");
		TimeSensor0_2_6_0_0_4.setCycleInterval(10);
		TimeSensor0_2_6_0_0_4.setLoop(true);
		Transform0_2_6_0_0.addChild(TimeSensor0_2_6_0_0_4);
		ROUTEObject ROUTE0_2_6_0_0_6 = new ROUTEObject();
		ROUTE0_2_6_0_0_6.setFromNode("transform");
		ROUTE0_2_6_0_0_6.setFromField("translation_changed");
		ROUTE0_2_6_0_0_6.setToNode("bounce");
		ROUTE0_2_6_0_0_6.setToField("set_translation");
		Transform0_2_6_0_0.addChild(ROUTE0_2_6_0_0_6);
		ROUTEObject ROUTE0_2_6_0_0_8 = new ROUTEObject();
		ROUTE0_2_6_0_0_8.setFromNode("transform");
		ROUTE0_2_6_0_0_8.setFromField("scale_changed");
		ROUTE0_2_6_0_0_8.setToNode("bounce");
		ROUTE0_2_6_0_0_8.setToField("set_scale");
		Transform0_2_6_0_0.addChild(ROUTE0_2_6_0_0_8);
		ROUTEObject ROUTE0_2_6_0_0_10 = new ROUTEObject();
		ROUTE0_2_6_0_0_10.setFromNode("bounce");
		ROUTE0_2_6_0_0_10.setFromField("translation_changed");
		ROUTE0_2_6_0_0_10.setToNode("transform");
		ROUTE0_2_6_0_0_10.setToField("set_translation");
		Transform0_2_6_0_0.addChild(ROUTE0_2_6_0_0_10);
		ROUTEObject ROUTE0_2_6_0_0_12 = new ROUTEObject();
		ROUTE0_2_6_0_0_12.setFromNode("bounce");
		ROUTE0_2_6_0_0_12.setFromField("scale_changed");
		ROUTE0_2_6_0_0_12.setToNode("transform");
		ROUTE0_2_6_0_0_12.setToField("set_scale");
		Transform0_2_6_0_0.addChild(ROUTE0_2_6_0_0_12);
		ROUTEObject ROUTE0_2_6_0_0_14 = new ROUTEObject();
		ROUTE0_2_6_0_0_14.setFromNode("bubbleClock");
		ROUTE0_2_6_0_0_14.setFromField("fraction_changed");
		ROUTE0_2_6_0_0_14.setToNode("bounce");
		ROUTE0_2_6_0_0_14.setToField("set_fraction");
		Transform0_2_6_0_0.addChild(ROUTE0_2_6_0_0_14);
		Transform0_2_6_0_0.setDEF("transform");
		ProtoBody0_2_6_0.addChild(Transform0_2_6_0_0);
		ProtoDeclare0_2_6.setProtoBody(ProtoBody0_2_6_0);
		ProtoDeclare0_2_6.setName("Bubble");
		Scene0_2.addChild(ProtoDeclare0_2_6);
		ProtoInstanceObject ProtoInstance0_2_8 = new ProtoInstanceObject();
		ProtoInstance0_2_8.setName("Bubble");
		ProtoInstance0_2_8.setDEF("bubbleA");
		Scene0_2.addChild(ProtoInstance0_2_8);
		ProtoInstanceObject ProtoInstance0_2_10 = new ProtoInstanceObject();
		ProtoInstance0_2_10.setName("Bubble");
		ProtoInstance0_2_10.setDEF("bubbleB");
		Scene0_2.addChild(ProtoInstance0_2_10);
		ProtoInstanceObject ProtoInstance0_2_12 = new ProtoInstanceObject();
		ProtoInstance0_2_12.setName("Bubble");
		ProtoInstance0_2_12.setDEF("bubbleC");
		Scene0_2.addChild(ProtoInstance0_2_12);
		ProtoInstanceObject ProtoInstance0_2_14 = new ProtoInstanceObject();
		ProtoInstance0_2_14.setName("Bubble");
		ProtoInstance0_2_14.setDEF("bubbleD");
		Scene0_2.addChild(ProtoInstance0_2_14);
		X3D0.setScene(Scene0_2);
		X3D0.setProfile("Immersive");
		X3D0.setVersion("3.3");
        ConfigurationProperties.setShowDefaultAttributes(true);
        ConfigurationProperties.setIndentCharacter(ConfigurationProperties.indentCharacter_DEFAULT);
        ConfigurationProperties.setIndentIncrement(ConfigurationProperties.indentIncrement_DEFAULT);
        ConfigurationProperties.setX3dCanonicalForm();
        ConfigurationProperties.initialize();
	ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_nativeJava);
	X3D0.toFileJSON(args[0]);
	}
}
