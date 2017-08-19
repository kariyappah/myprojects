package com.kp.rest;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/files")
public class FileDownloadService {
	private static final String TEXT_FILE_PATH = System.getProperty("user.dir")+"\\webservices\\resources\\myfile.txt";

	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response getTextFile() {
		File file = new File(TEXT_FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"javatpoint_file.txt\"");
		return response.build();

	}

	private static final String IMAGE_FILE_PATH = System.getProperty("user.dir")+"\\webservices\\resources\\myimage.png";

	@GET
	@Path("/image")
	@Produces("image/png")
	public Response getImageFile() {
		File file = new File(IMAGE_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"javatpoint_image.png\"");
		return response.build();

	}

	private static final String PDF_FILE_PATH = System.getProperty("user.dir")+"\\webservices\\resources\\mypdf.pdf";

	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getFile() {
		File file = new File(PDF_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"javatpoint_pdf.pdf\"");
		return response.build();
	}
}