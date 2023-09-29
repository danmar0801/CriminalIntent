package datebase

import androidx.room.Dao
import androidx.room.Query
import com.example.criminalintent.crime
import java.util.UUID

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    suspend fun getCrimes(): List<crime>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): crime
}
