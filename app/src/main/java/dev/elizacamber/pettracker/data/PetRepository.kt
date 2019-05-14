package dev.elizacamber.pettracker.data


class PetRepository private constructor(private val petDao: PetDao){

    fun getPets() = petDao.getAll()
    fun insertPets() = petDao.insertAll()
    fun deletePet(pet: Pet) = petDao.delete(pet)

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: PetRepository? = null

        fun getInstance(petDao: PetDao) =
            instance ?: synchronized(this) {
                instance ?: PetRepository(petDao).also { instance = it }
            }
    }
}