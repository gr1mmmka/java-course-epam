package by.khmara.epam.mod4.task13;

import java.util.List;

/*
 * Создать объект Государство, используя классы Область, Город, Район. Методы:
 * вывести на консоль столицу, количество областей, площадь, областные центры
 */

public class Runner {
	
	public static void main(String[] args) {

		City gomel = new City("Gomel", true, 139.8);
		District gomelDistrict = new District("Gomelskiy district", gomel, 1_951);
		City mazyr = new City("Mazyr", 44.14);
		District mazyrDistrict = new District("Mazyrskiy district", mazyr, 1_603);
		City dobrush = new City("Dobrush", 19.52);
		District dobrushDistrict = new District("Dobrushskiy district", dobrush, 1_452);
		City vetka = new City("Vetka", 8.91);
		District vetkaDistrict = new District("Vetkovskiy district", vetka, 1_558);

		Region gomelRegion = new Region(3, "Region of Gomel",
				List.of(gomelDistrict, mazyrDistrict, dobrushDistrict, vetkaDistrict));

		City minsk = new City("Minsk", true, true, 348.84);
		District minskDistrict = new District("Minskiy district", minsk, 1_902);
		City soligorsk = new City("Soligorsk", 15);
		District soligorskDistrict = new District("Soligorskiy district", soligorsk, 2_498);
		City slutsk = new City("Slutsk", 26.6);
		District slutskDistrict = new District("Slutskiy district", slutsk, 1_821);

		Region minskRegion = new Region(7, "Region of Minsk",
				List.of(minskDistrict, soligorskDistrict, slutskDistrict));

		Goverment belarus = new Goverment("Belarus", List.of(gomelRegion, minskRegion));

		belarus.printCapital();
		belarus.printCountOfRegions();
		belarus.printRegionsCenter();
		belarus.printTotalSquare();

	}

}
