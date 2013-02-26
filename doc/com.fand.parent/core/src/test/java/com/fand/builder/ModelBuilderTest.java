package com.fand.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

public class ModelBuilderTest {
	private ModelBuilder newModelBuilder() {
		return new DefaultModelBuilder();
	}

	@Test
	public void testCreateBy1() {
		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putExtend("test", ModelArgs._create, null, PersonGwSn._np00);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testCreateBy2() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putObjectField(new ModelArgs(ModelArgs._create, personGwSn, PersonGwSn._np00, PersonGwSn._snapDate,
				PersonGwSn._np05).setIgnoreProperties(PersonGwSn._np05));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testCreateBy3() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putObjectField(new ModelArgs(ModelArgs._create, personGwSn));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testCreateBy4() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putObjectField(new ModelArgs(ModelArgs._create, personGwSn).setSkipNullValue(true));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testCreateBy5() {
		final Map<String, Object> kvMap = new HashMap<>();

		kvMap.put("id", "444");
		kvMap.put("name", "333");
		kvMap.put("title", "222");
		kvMap.put("content", "111");

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putExtend(ModelArgs._create, kvMap, null);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testFindBy1() {
		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._find, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putExtend("test", null, null, PersonGwSn._np00);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testFindBy2() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._find, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putObjectField(new ModelArgs(personGwSn).setUseProperties(PersonGwSn._np00, PersonGwSn._snapDate,
				PersonGwSn._np05).setIgnoreProperties(PersonGwSn._np05));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testFindBy3() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._find, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putObjectField(new ModelArgs(personGwSn));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testFindBy4() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._find, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putObjectField(new ModelArgs(personGwSn).setSkipNullValue(true));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testFindBy5() {
		final Map<String, Object> kvMap = new HashMap<>();

		kvMap.put("id", "444");
		kvMap.put("name", "333");
		kvMap.put("title", "222");
		kvMap.put("content", "111");

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._find, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putExtend(null, kvMap, null);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testGetBy1() {
		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._get, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putExtend("test", null, null, PersonGwSn._np00);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testGetBy2() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._get, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putObjectField(new ModelArgs(personGwSn).setUseProperties(PersonGwSn._np00, PersonGwSn._snapDate,
				PersonGwSn._np05).setIgnoreProperties(PersonGwSn._np05));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testGetBy3() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._get, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putObjectField(new ModelArgs(personGwSn));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testGetBy4() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._get, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putObjectField(new ModelArgs(personGwSn).setSkipNullValue(true));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testGetBy5() {
		final Map<String, Object> kvMap = new HashMap<>();

		kvMap.put("id", "444");
		kvMap.put("name", "333");
		kvMap.put("title", "222");
		kvMap.put("content", "111");

		// new HashMap<String,Object>{};

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._get, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putExtend(null, kvMap, null);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testGetBy6() {
		final WorkflowLo workflowLo = new WorkflowLo();

		workflowLo.setWfLogId(UUID.randomUUID().toString());

		workflowLo.setWfCode("test123");

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putTrueExtend(ModelArgs._get, PersonGwSn._snapDate, PersonGwSn._np00);

		modelBuilder.putObjectField(new ModelArgs(workflowLo).setSkipNullValue(true).addUseAnnotationClassList(
				javax.persistence.Id.class));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testReadBy1() {
		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.put(PersonGwSn._np00, ModelArgs._read, ModelArgs._field, ModelArgs._id);

		modelBuilder.putExtend("test", null, null, PersonGwSn._np00);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testReadBy2() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.put(PersonGwSn._np00, ModelArgs._read, ModelArgs._field, ModelArgs._id);

		modelBuilder.putObjectField(new ModelArgs(personGwSn).setIgnoreProperties(PersonGwSn._np05).setUseProperties(
				PersonGwSn._np00, PersonGwSn._snapDate, PersonGwSn._np05));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testReadBy3() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.put(PersonGwSn._np00, ModelArgs._read, ModelArgs._field, ModelArgs._id);

		modelBuilder.putObjectField(new ModelArgs(personGwSn));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testReadBy4() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.put(PersonGwSn._np00, ModelArgs._read, ModelArgs._field, ModelArgs._id);

		modelBuilder.putObjectField(new ModelArgs(personGwSn).setSkipNullValue(true));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testReadBy5() {
		final Map<String, Object> kvMap = new HashMap<>();

		kvMap.put("id", "444");
		kvMap.put("name", "333");
		kvMap.put("title", "222");
		kvMap.put("content", "111");

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.put(PersonGwSn._np00, ModelArgs._read, ModelArgs._field, ModelArgs._id);

		modelBuilder.putExtend(null, kvMap, null);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testSaveBy1() {
		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putExtend("test", ModelArgs._save, null, PersonGwSn._np00);

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testSaveBy2() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putObjectField(new ModelArgs(ModelArgs._save, personGwSn, PersonGwSn._np00, PersonGwSn._snapDate,
				PersonGwSn._np05).setIgnoreProperties(PersonGwSn._np05));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testSaveBy3() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putObjectField(new ModelArgs(ModelArgs._save, personGwSn));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testSaveBy4() {
		final PersonGwSn personGwSn = new PersonGwSn();

		personGwSn.setSnapDate("20121102");

		personGwSn.setNp00(new Double(11));

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putObjectField(new ModelArgs(ModelArgs._save, personGwSn).setSkipNullValue(true));

		System.out.println(modelBuilder.build());
	}

	@Test
	public void testSaveBy5() {
		final Map<String, Object> kvMap = new HashMap<>();

		kvMap.put("id", "444");
		kvMap.put("name", "333");
		kvMap.put("title", "222");
		kvMap.put("content", "111");

		final ModelBuilder modelBuilder = this.newModelBuilder();

		modelBuilder.putExtend(ModelArgs._save, kvMap, null);

		System.out.println(modelBuilder.build());
	}
}
