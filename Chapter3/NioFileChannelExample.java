import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NioFileChannelExample {

    public static void main(String[] args) {
        Path filePath = Path.of("nio-example.txt");

        // Writing to a file using NIO
        try (FileChannel fileChannel = FileChannel.open(
                filePath,
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE)) {

            String content = "Hello, NIO!";
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(content.getBytes());

            buffer.flip(); // Prepare the buffer for writing
            fileChannel.write(buffer);

            System.out.println("Data written to file using NIO.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file using NIO
        try (FileChannel fileChannel = FileChannel.open(
                filePath,
                StandardOpenOption.READ)) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(buffer);

            while (bytesRead != -1) {
                buffer.flip(); // Prepare the buffer for reading
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear(); // Clear buffer for the next read
                bytesRead = fileChannel.read(buffer);
            }

            System.out.println(); // newline after file content
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
