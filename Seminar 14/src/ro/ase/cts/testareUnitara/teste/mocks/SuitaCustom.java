package ro.ase.cts.testareUnitara.teste.mocks;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.testareUnitara.teste.TesteGrupaFixture;
import ro.ase.cts.testareUnitara.teste.TesteGrupaMock;
import ro.ase.cts.testareUnitara.teste.categorii.ConstructorGrupa;
import ro.ase.cts.testareUnitara.teste.categorii.GetPromovabilitateCategory;



@RunWith(Categories.class)
@Suite.SuiteClasses({
	TesteGrupaMock.class,
	TesteGrupaMock.class,
	TesteGrupaFixture.class
})
//@Categories.IncludeCategory({GetPromovabilitateCategory.class, TesteGrupaFixture.class})
@Categories.ExcludeCategory({GetPromovabilitateCategory.class, ConstructorGrupa.class})
public class SuitaCustom {

}