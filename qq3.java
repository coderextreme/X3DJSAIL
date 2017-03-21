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
public class qq3 {
	public static void main(String[] args) {
        ConfigurationProperties.setShowDefaultAttributes(true);
        ConfigurationProperties.setIndentCharacter(ConfigurationProperties.indentCharacter_DEFAULT);
        ConfigurationProperties.setIndentIncrement(ConfigurationProperties.indentIncrement_DEFAULT);
        ConfigurationProperties.setX3dCanonicalForm();
        ConfigurationProperties.initialize();
	ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_nativeJava);
	ConfigurationProperties.setDeleteIntermediateFiles(false);
	new X3DObject()
	.setProfile("Immersive")
	.setVersion("3.3")
	.setHead(new headObject()
		.addMeta(new metaObject()
			.setName("title")
			.setContent("qq3.x3d")
		)
		.addMeta(new metaObject()
			.setName("creator")
			.setContent("John Carlson")
		)
		.addMeta(new metaObject()
			.setName("translator")
			.setContent("John Carlson")
		)
		.addMeta(new metaObject()
			.setName("created")
			.setContent("11 Jan 2015")
		)
		.addMeta(new metaObject()
			.setName("revised")
			.setContent("11 Jan 2015")
		)
		.addMeta(new metaObject()
			.setName("description")
			.setContent("12 extrusions to test prototype expander")
		)
		.addMeta(new metaObject()
			.setName("identifier")
			.setContent("http://coderextreme.net/x3d/qq3.x3d")
		)
		.addMeta(new metaObject()
			.setName("generator")
			.setContent("manual")
		)
	)
	.setScene(new SceneObject()
		.addChild(new ProtoDeclareObject()
			.setName("Process")
			.setProtoBody(new ProtoBodyObject()
				.addChild(new GroupObject()
					.addComments(new CommentsBlock("left"))
					.addChild(new TransformObject()
						.setScale(new float[] {0.5f,0.5f,0.5f})
						.addChild(new ShapeObject()
							.setAppearance(new AppearanceObject()
								.setMaterial(new MaterialObject()
									.setDEF("MaterialLeftDown")
									.setDiffuseColor(new float[] {0.7f,1f,0f})
								)
							)
							.setGeometry(new ExtrusionObject()
								.setSpine(new float[] {-2.5f,0f,0f,-1.5f,0f,0f})
								.setCreaseAngle(0.785f)
								.setCrossSection(new float[] {1f,0f,0.92f,-0.38f,0.71f,-0.71f,0.38f,-0.92f,0f,-1f,-0.38f,-0.92f,-0.71f,-0.71f,-0.92f,-0.38f,-1f,0f,-0.92f,0.38f,-0.71f,0.71f,-0.38f,0.92f,0f,1f,0.38f,0.92f,0.71f,0.71f,0.92f,0.38f,1f,0f})
							)
						)
					)
					.addComments(new CommentsBlock("right"))
					.addChild(new TransformObject()
						.setScale(new float[] {0.5f,0.5f,0.5f})
						.addChild(new ShapeObject()
							.setAppearance(new AppearanceObject()
								.setMaterial(new MaterialObject()
									.setDEF("MaterialUpRight")
									.setDiffuseColor(new float[] {0f,0.7f,1f})
								)
							)
							.setGeometry(new ExtrusionObject()
								.setSpine(new float[] {1.5f,0f,0f,2.5f,0f,0f})
								.setCreaseAngle(0.785f)
								.setCrossSection(new float[] {1f,0f,0.92f,-0.38f,0.71f,-0.71f,0.38f,-0.92f,0f,-1f,-0.38f,-0.92f,-0.71f,-0.71f,-0.92f,-0.38f,-1f,0f,-0.92f,0.38f,-0.71f,0.71f,-0.38f,0.92f,0f,1f,0.38f,0.92f,0.71f,0.71f,0.92f,0.38f,1f,0f})
							)
						)
					)
					.addComments(new CommentsBlock("up"))
					.addChild(new TransformObject()
						.setScale(new float[] {0.5f,0.5f,0.5f})
						.addChild(new ShapeObject()
							.setAppearance(new AppearanceObject()
								.setMaterial(new MaterialObject()
									.setUSE("MaterialUpRight")
								)
							)
							.setGeometry(new ExtrusionObject()
								.setSpine(new float[] {0f,1.5f,0f,0f,2.5f,0f})
								.setCreaseAngle(0.785f)
								.setCrossSection(new float[] {1f,0f,0.92f,-0.38f,0.71f,-0.71f,0.38f,-0.92f,0f,-1f,-0.38f,-0.92f,-0.71f,-0.71f,-0.92f,-0.38f,-1f,0f,-0.92f,0.38f,-0.71f,0.71f,-0.38f,0.92f,0f,1f,0.38f,0.92f,0.71f,0.71f,0.92f,0.38f,1f,0f})
							)
						)
					)
					.addComments(new CommentsBlock("down"))
					.addChild(new TransformObject()
						.setScale(new float[] {0.5f,0.5f,0.5f})
						.addChild(new ShapeObject()
							.setAppearance(new AppearanceObject()
								.setMaterial(new MaterialObject()
									.setUSE("MaterialLeftDown")
								)
							)
							.setGeometry(new ExtrusionObject()
								.setSpine(new float[] {0f,-2.5f,0f,0f,-1.5f,0f})
								.setCreaseAngle(0.785f)
								.setCrossSection(new float[] {1f,0f,0.92f,-0.38f,0.71f,-0.71f,0.38f,-0.92f,0f,-1f,-0.38f,-0.92f,-0.71f,-0.71f,-0.92f,-0.38f,-1f,0f,-0.92f,0.38f,-0.71f,0.71f,-0.38f,0.92f,0f,1f,0.38f,0.92f,0.71f,0.71f,0.92f,0.38f,1f,0f})
							)
						)
					)
				)
			)
		)
		.addChild(new ViewpointObject()
			.setDescription("Process pipes")
			.setOrientation(new float[] {1f,0f,0f,-0.4f})
			.setPosition(new float[] {0f,5f,12f})
		)
		.addChild(new TransformObject()
			.setTranslation(new float[] {0f,-2.5f,0f})
			.addChild(new ProtoInstanceObject()
				.setName("Process")
			)
		)
		.addChild(new TransformObject()
			.addChild(new ProtoInstanceObject()
				.setName("Process")
			)
		)
		.addChild(new TransformObject()
			.setTranslation(new float[] {0f,2.5f,0f})
			.addChild(new ProtoInstanceObject()
				.setName("Process")
			)
		)
	)
	.toFileJSON("qq3.new.json");
	}
}
