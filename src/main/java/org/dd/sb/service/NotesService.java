package org.dd.sb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dd.sb.model.Note;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
	
	private List<Note> noteList = new ArrayList<> (Arrays.asList(new Note("Aadhar", "3131231"),
			new Note("LPG", "2423432"), 
			new Note("LIC Renewal Date", "26/Jan")));
	
	public List<Note> getNotes(){
		return noteList;
	}
	
	public Note getNote(String id){
		return noteList.stream().filter(a -> a.getId().equals(id)).findFirst().get();
	}

	public void addNote(Note note) {
		noteList.add(note);
	}

	public void updateNote(String id, Note note) {
		for(int i = 0; i<noteList.size(); i++){
			if(noteList.get(i).getId().equals(id)){
				noteList.set(i, note);
				return;
			}
		}
	}

	public void deleteNote(String id) {
		noteList.removeIf(t -> t.getId().equals(id));
	}

}
