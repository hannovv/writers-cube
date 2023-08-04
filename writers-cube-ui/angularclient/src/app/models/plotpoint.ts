export class Plotpoint {

  id : string;
  storyBoardId : string;
  description : string;

  constructor(id: string, storyboardId: string, description: string) {
    this.id = id;
    this.storyBoardId = storyboardId;
    this.description = description;
  }
}
