# p2-repository-tools

## Sample Usage

### Listing artifacts
```java
public class ArtifactApplication {

	public static void main(String[] args) throws JAXBException {
        if (args.length == 1) {
			new ArtifactApplication().printContents(new File(args[0], "artifacts.xml"));
		}
	}

	public void printContents(File artifacts) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(ArtifactsRepository.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		ArtifactsRepository repository = (ArtifactsRepository) unmarshaller.unmarshal(artifacts);

		System.out.println("Repository: " + repository.getName() + " "
				+ repository.getVersion() + " of type " + repository.getType());
		System.out.println();
		printRepositoryProperties(repository);
		System.out.println();
		printMappings(repository);
		System.out.println();
		printArtifacts(repository);
	}

	private void printRepositoryProperties(ArtifactsRepository repository) {
		Properties properties = repository.getProperties();
		System.out.println("Properties size is " + properties.getSize());
		for (Property property : properties.getPropertites()) {
			System.out.println("Property is " + property.getName() + " = "
					+ property.getValue());
		}
	}

	private void printMappings(ArtifactsRepository repository) {
		Mappings mappings = repository.getMappings();
		System.out.println("Mappings size is " + mappings.getSize());
		for (Rule rule : mappings.getRules()) {
			System.out.println("Rule output: " + rule.getOutput() + " filter: "
					+ rule.getFilter());
		}
	}

	private void printArtifacts(ArtifactsRepository repository) {
		Artifacts artifacts = repository.getArtifacts();
		System.out.println("Artifacts size is " + artifacts.getSize());
		for (Artifact artifact : artifacts.getArtifacts()) {
			System.out.println(artifact.getClassifier() + ":"
					+ artifact.getId() + "_" + artifact.getVersion());
			System.out.println("\tArtifact Properties size is "
					+ artifact.getProperties().getSize());
			for (Property property : artifact.getProperties().getPropertites()) {
				System.out.println("\tArtifact Property is "
						+ property.getName() + " = " + property.getValue());
			}
		}
	}
}
```

### Listing Metadata
```java
public class MetadataApplication {

	public static void main(String[] args) throws JAXBException {
        if (args.length == 1) {
			new MetadataApplication().printContents(new File(args[0],
					"content.xml"));
		}
	}

	public void printContents(File artifacts) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(MetadataRepository.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		MetadataRepository repository = (MetadataRepository) unmarshaller
				.unmarshal(artifacts);

		System.out.println("Repository: " + repository.getName() + " "
				+ repository.getVersion() + " of type " + repository.getType());
		System.out.println();
		printProperties(repository.getProperties());
		System.out.println();
		printUnits(repository);
	}

	private void printProperties(Properties properties) {
		if (properties != null) {
			System.out.println("\tProperties size is " + properties.getSize());
			for (Property property : properties.getPropertites()) {
				System.out.println("\tProperty is " + property.getName()
						+ " = " + property.getValue());
			}
		}
	}

	private void printUnits(MetadataRepository repository) {
		Units units = repository.getUnits();
		System.out.println("Units size is " + units.getSize());
		for (Unit unit : units.getUnits()) {
			System.out.println("Unit: " + unit.getId() + "_"
					+ unit.getVersion() + "(" + unit.getSingleton() + ")");
			printProperties(unit.getProperties());
			printProvides(unit);
			printRequires(unit);
			printFilter(unit);
			printArtifacts(unit);
			printTouchPoint(unit);
			printTouchPointData(unit);
			printLicense(unit);
			printCopyright(unit);
		}
	}

	private void printProvides(Unit unit) {
		Provides provides = unit.getProvides();
		System.out.println("Provides size = " + provides.getSize());
		for (Provided provided : provides.getProvided()) {
			System.out
					.println("\t" + provided.getName() + "_"
							+ provided.getVersion() + " ns: "
							+ provided.getNamespace());
		}
	}

	private void printRequires(Unit unit) {
		Requires requires = unit.getRequires();
		if (requires != null) {
			System.out.println("Requires size = " + requires.getSize());
			for (Required required : requires.getRequired()) {
				System.out.println("\t" + required.getName() + "_"
						+ required.getRange() + " ns: "
						+ required.getNamespace());
			}
		}
	}

	private void printFilter(Unit unit) {
		Filter filter = unit.getFilter();
		if (filter != null) {
			System.out.println("Filter is " + filter.getValue());
		}
	}

	private void printArtifacts(Unit unit) {
		Artifacts artifacts = unit.getArtifacts();
		if (artifacts != null) {
			System.out.println("Artifacts size is " + artifacts.getSize());
			for (Artifact artifact : artifacts.getArtifacts()) {
				System.out.println(artifact.getClassifier() + ":"
						+ artifact.getId() + "_" + artifact.getVersion());
				printProperties(artifact.getProperties());
			}
		}
	}

	private void printTouchPoint(Unit unit) {
		Touchpoint touchpoint = unit.getToucpint();
		if (touchpoint != null) {
			System.out.println("Touchpoint: " + touchpoint.getId() + "_"
					+ touchpoint.getVersion());
		}
	}

	private void printTouchPointData(Unit unit) {
		TouchpointData touchpointData = unit.getTouchpointData();
		if (touchpointData != null) {
			System.out.println("TouchpointData size: "
					+ touchpointData.getSize());
			Instructions instructions = touchpointData.getInstructions();
			System.out.println("Instructions size: " + instructions.getSize());
			for (Instruction instruction : instructions.getInstructions()) {
				System.out.println("\tKey = " + instruction.getKey()
						+ " Value = " + instruction.getValue());
			}
		}
	}

	private void printLicense(Unit unit) {
		Licenses licenses = unit.getLicenses();
		if (licenses != null) {
			System.out.println("Licenses size = " + licenses.getSize());
			for (License license : licenses.getLicenses()) {
				System.out.println("URL: " + license.getUrl() + " URI: "
						+ license.getUri() + " License: " + license.getValue());
			}
		}
	}

	private void printCopyright(Unit unit) {
		Copyright copyright = unit.getCopyright();
		if (copyright != null) {
			System.out.println("Copyright: " + copyright.getValue());
		}
	}
}
```