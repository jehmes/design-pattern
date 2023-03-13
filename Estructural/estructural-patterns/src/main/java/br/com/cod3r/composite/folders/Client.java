package br.com.cod3r.composite.folders;

import br.com.cod3r.composite.folders.model.Component;
import br.com.cod3r.composite.folders.model.File;
import br.com.cod3r.composite.folders.model.Folder;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		Component file1 = new File("Arquivo 1");
		Component file2 = new File("Arquivo 2");
		Component file3 = new File("Arquivo 3");
		Component file4 = new File("Arquivo 4");

		List<Component> listFile3File4 = Arrays.asList(file3, file4);
		Component folder2 = new Folder("Pasta 2", listFile3File4);
		List<Component> listFile1File2 = Arrays.asList(file1, file2, folder2);

		Component folder1 = new Folder("Pasta 1", listFile1File2);

		List<Component> listFolder1Folder2 = Arrays.asList(folder1);

		Component folderRoot = new Folder("src", listFolder1Folder2);
		System.out.println(folderRoot);
		folderRoot.print("");

	}
}
