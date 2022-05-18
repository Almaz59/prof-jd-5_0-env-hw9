package pro.sky.profjd5_0envhw9.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ArrayIsFullExeption extends RuntimeException {
}


