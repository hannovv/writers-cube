export class Storyboardprompt {

    storyBoardId: string;
    prompt: string;
    
    constructor(storyBoardId: string, prompt: string) {
        this.prompt = prompt;
        this.storyBoardId = storyBoardId;
    }
}
