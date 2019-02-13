import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.impl.client.HttpClientBuilder
import java.io.File
import java.io.FileOutputStream

fun main(args: Array<String>) {

    var client = HttpClientBuilder.create().build();

    var method = HttpGet("http://img1.mm131.me/pic/1577/4.jpg");

    var response = client.execute(method);

    var file = File("4.jpg");

    var out = FileOutputStream(file);
    response.entity.writeTo(out);

}