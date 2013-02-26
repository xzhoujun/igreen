package com.sany.hrm.system.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fand.builder.ModelArgs;
import com.sany.hrm.system.dto.DirectoryDto;
import com.sany.hrm.system.po.Directory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:**/applicationContext-*.xml" })
public class SystemRunServiceTest {
	@Autowired
	private SystemRunService systemRunService;

	@Test
	public void testCreateDirectoryStringBooleanModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testCreateDirectoryStringBooleanObjectArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsbbbbbbbbbbbgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory1 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory2 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			this.systemRunService.createDirectory(StringUtils.EMPTY, true, directory, directory, directory, directory,
					directory1, directory2);

			this.systemRunService.createDirectory(StringUtils.EMPTY, false, directory, directory, directory, directory,
					directory1, directory2);
		}
	}

	@Test
	public void testCreateDirectoryStringStringBooleanStringModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testCreateDirectoryStringStringBooleanStringObjectArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsbbbbbbbbbbbgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory1 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory2 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			this.systemRunService.createDirectory(StringUtils.EMPTY, true, directory, directory, directory, directory,
					directory1, directory2);

			this.systemRunService.createDirectory(StringUtils.EMPTY, false, directory, directory, directory, directory,
					directory1, directory2);
		}
	}

	@Test
	public void testFindDirectoryStringClassOfTModelArgsArray() {
		final Directory directory = new Directory().setName("dfgsgsg");

		final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._find, directory).setSkipNullValue(true);

		final List<Directory> directoryList = this.systemRunService.findDirectory("", Directory.class, modelArgs1);

		System.out.println(directoryList.size());
	}

	@Test
	public void testFindDirectoryStringModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testGetDirectoryStringClassOfTModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testGetDirectoryStringModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			final DirectoryDto directoryDto = this.systemRunService.getDirectory(null, DirectoryDto.class, modelArgs1,
					modelArgs2);

			System.out.println(directoryDto);
		}
	}

	@Test
	public void testPaginationDirectoryStringStringIntIntClassOfTModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testPaginationDirectoryStringStringIntIntModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", true, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.createDirectory("", false, modelArgs1, modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testReadDirectoryStringStringClassOfTModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			final int rowCount = this.systemRunService.saveDirectory(StringUtils.EMPTY, true, modelArgs1, modelArgs2,
					modelArgs3);

			System.out.println(rowCount);

			final String data = this.systemRunService.readDirectory(StringUtils.EMPTY, Directory._name, String.class,
					modelArgs1, modelArgs2, modelArgs3);

			System.out.println(data);
		}
	}

	@Test
	public void testReadDirectoryStringStringModelArgsArray() {
		final Directory directory = new Directory().setName("dfgsgsg");

		final ModelArgs modelArgs2 = new ModelArgs(directory).setSkipNullValue(true);

		final int count = this.systemRunService.readDirectory(null, null, modelArgs2);

		System.out.println(count);
	}

	@Test
	public void testReadListDirectory() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			final int rowCount = this.systemRunService.saveDirectory(StringUtils.EMPTY, true, modelArgs1, modelArgs2,
					modelArgs3);

			System.out.println(rowCount);

			final List<String> dataList = this.systemRunService.readListDirectory(StringUtils.EMPTY, Directory._name,
					String.class, modelArgs1, modelArgs2, modelArgs3);

			System.out.println(dataList);
		}
	}

	@Test
	public void testReadListDirectoryFiStringStringClassOfTMapOfStringObject() {
		final Directory directory = new Directory().setName("dfgsgsg");

		final ModelArgs modelArgs2 = new ModelArgs(directory).setSkipNullValue(true);

		final List<String> nameList = this.systemRunService.readListDirectory(null, Directory._id, String.class, modelArgs2);

		System.out.println(nameList);
	}

	@Test
	public void testRemoveDirectoryStringModelArgsArray() {
		final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
				.setBeginTi(new Date()).setCreatePeId("tttt");

		final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

		final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

		final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
				.addIgnoreAnnotationClassList(javax.persistence.Id.class);

		int rowCount = this.systemRunService.saveDirectory(StringUtils.EMPTY, true, modelArgs1, modelArgs2, modelArgs3);

		System.out.println(rowCount);

		rowCount = this.systemRunService.removeDirectory(null, modelArgs2);

		System.out.println(rowCount);
	}

	@Test
	public void testRemoveDirectoryStringObjectArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsbbbbbbbbbbbgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory1 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory2 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			int rowCount = this.systemRunService.saveDirectory(StringUtils.EMPTY, true, directory, directory1, directory2);

			System.out.println(rowCount);

			rowCount = this.systemRunService.removeDirectory(StringUtils.EMPTY, directory, directory1, directory2);

			System.out.println(rowCount);
		}
	}

	@Test
	public void testSaveDirectoryStringBooleanModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.saveDirectory(StringUtils.EMPTY, false, modelArgs1, modelArgs2, modelArgs3);

			this.systemRunService.saveDirectory(StringUtils.EMPTY, true, modelArgs1, modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testSaveDirectoryStringBooleanObjectArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsbbbbbbbbbbbgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory1 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory2 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			this.systemRunService.saveDirectory(StringUtils.EMPTY, false, directory, directory1, directory2);

			this.systemRunService.saveDirectory(StringUtils.EMPTY, true, directory, directory1, directory2);
		}
	}

	@Test
	public void testSaveDirectoryStringBooleanStringStringModelArgsArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, directory);

			final ModelArgs modelArgs2 = new ModelArgs(directory).addUseAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, directory)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			this.systemRunService.saveDirectory(StringUtils.EMPTY, false, StringUtils.EMPTY, StringUtils.EMPTY, modelArgs1,
					modelArgs2, modelArgs3);

			this.systemRunService.saveDirectory(StringUtils.EMPTY, true, StringUtils.EMPTY, StringUtils.EMPTY, modelArgs1,
					modelArgs2, modelArgs3);
		}
	}

	@Test
	public void testSaveDirectoryStringBooleanStringStringObjectArray() {
		for (int i = 0; i < 1; i++) {
			final Directory directory = new Directory().setId(UUID.randomUUID().toString()).setName("dfgsbbbbbbbbbbbgsg")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory1 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			final Directory directory2 = new Directory().setId(UUID.randomUUID().toString()).setName("aaaaaaaaaaaaa")
					.setBeginTi(new Date()).setCreatePeId("tttt");

			this.systemRunService.saveDirectory(null, false, null, null, directory, directory, directory, directory,
					directory1, directory2);

			this.systemRunService.saveDirectory(null, true, null, null, directory, directory, directory, directory, directory1,
					directory2);
		}
	}
}
